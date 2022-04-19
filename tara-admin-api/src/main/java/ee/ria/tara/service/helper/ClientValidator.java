package ee.ria.tara.service.helper;

import ee.ria.tara.configuration.providers.AdminConfigurationProvider;
import ee.ria.tara.controllers.exception.InvalidDataException;
import ee.ria.tara.model.Client;
import ee.ria.tara.model.InstitutionType;
import ee.ria.tara.repository.ClientRepository;
import lombok.RequiredArgsConstructor;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ClientValidator {

    private final AdminConfigurationProvider adminConfProvider;
    private final ClientRepository clientRepository;

    public void validateClient(Client client, InstitutionType.TypeEnum institutionType) {
        if (adminConfProvider.isSsoMode() && institutionType == InstitutionType.TypeEnum.PRIVATE) {
            throw new InvalidDataException("Client.sso.privateInstitution");
        }
        validateRedirectUris(client);
        validateEidasRequesterId(client);
    }

    private void validateRedirectUris(Client client) {
        validateBackchannelLogoutUri(client);
        validatePostLogoutRedirectUris(client);
        client.getRedirectUris().forEach(uri -> validateUri(uri, "Client.redirectUri.missing"));
    }

    private void validateBackchannelLogoutUri(Client client) {
        if (adminConfProvider.isSsoMode()) {
            validateUri(client.getBackchannelLogoutUri(), "Client.backchannelUri.missing");
        } else {
            if (StringUtils.isNotBlank(client.getBackchannelLogoutUri())) {
                throw new IllegalStateException("Backchannel logout uri must not be set in TARA mode");
            }
        }
    }

    private void validatePostLogoutRedirectUris(Client client) {
        if (adminConfProvider.isSsoMode()) {
            List<String> postLogoutRedirectUris = client.getPostLogoutRedirectUris();
            if (postLogoutRedirectUris == null || postLogoutRedirectUris.isEmpty()) {
                throw new InvalidDataException("Client.postLogoutRedirectUri.missing");
            }
            postLogoutRedirectUris.forEach(uri -> validateUri(uri, "Client.postLogoutRedirectUri.missing"));

        } else {
            if (!CollectionUtils.isEmpty(client.getPostLogoutRedirectUris())) {
                throw new IllegalStateException("Post logout redirect uris must not be set in TARA mode");
            }
        }
    }

    private void validateUri(String uri, String errMsg) {
        try {
            URL url = new URL(uri);
            String protocol = url.getProtocol();
            String userInfo = url.getUserInfo();
            String fragment = url.toURI().getRawFragment();
            if (userInfo != null || !protocol.equals("https") || fragment != null) {
                throw new InvalidDataException(errMsg);
            }
        } catch (URISyntaxException | MalformedURLException ex) {
            throw new InvalidDataException(errMsg);
        }
    }

    private void validateEidasRequesterId(Client client) {
        if (adminConfProvider.isSsoMode()) {
            if (StringUtils.isNotBlank(client.getEidasRequesterId())) {
                throw new IllegalStateException("eIDAS RequesterID must not be set in SSO mode");
            }
        } else {
            if (StringUtils.isBlank(client.getEidasRequesterId())) {
                throw new InvalidDataException("Client.eidasRequesterId.missing");
            }
            validateClientWithEidasRequesterIdDoesNotExist(client);
        }
    }

    /*
        The field has a unique constraint thus this check should not be necessary.
        But catching that exception is a problem with @Transactional function.
        TODO: catch the exception during saving and throw "Client.eidasRequesterId.exists" from there.
     */
    private void validateClientWithEidasRequesterIdDoesNotExist(Client client) {
        ee.ria.tara.repository.model.Client existingClientWithEidasRequesterId = clientRepository
                .findByEidasRequesterId(client.getEidasRequesterId());
        if (existingClientWithEidasRequesterId != null &&
                !StringUtils.equals(existingClientWithEidasRequesterId.getClientId(), client.getClientId())) {
            throw new InvalidDataException("Client.eidasRequesterId.exists");
        }
    }
}