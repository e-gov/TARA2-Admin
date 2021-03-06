package ee.ria.tara.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import ee.ria.tara.model.ClientContact;
import ee.ria.tara.model.ClientMidSettings;
import ee.ria.tara.model.ClientSecretExportSettings;
import ee.ria.tara.model.ClientSmartIdSettings;
import ee.ria.tara.model.InstitutionMetainfo;
import ee.ria.tara.model.NameTranslations;
import ee.ria.tara.model.ShortNameTranslations;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Client
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class Client {

  @JsonProperty("id")
  private String id;

  @JsonProperty("client_id")
  private String clientId;

  @JsonProperty("client_name")
  private NameTranslations clientName;

  @JsonProperty("client_short_name")
  private ShortNameTranslations clientShortName;

  @JsonProperty("client_secret_export_settings")
  private ClientSecretExportSettings clientSecretExportSettings;

  @JsonProperty("institution_metainfo")
  private InstitutionMetainfo institutionMetainfo;

  @JsonProperty("redirect_uris")
  @Valid
  private List<String> redirectUris = new ArrayList<>();

  @JsonProperty("post_logout_redirect_uris")
  @Valid
  private List<String> postLogoutRedirectUris = null;

  @JsonProperty("scope")
  @Valid
  private List<String> scope = new ArrayList<>();

  @JsonProperty("secret")
  private String secret;

  @JsonProperty("eidas_requester_id")
  private String eidasRequesterId;

  @JsonProperty("description")
  private String description;

  @JsonProperty("info_notification_emails")
  @Valid
  private List<String> infoNotificationEmails = null;

  @JsonProperty("sla_notification_emails")
  @Valid
  private List<String> slaNotificationEmails = null;

  @JsonProperty("is_user_consent_required")
  private Boolean isUserConsentRequired;

  @JsonProperty("skip_user_consent_client_ids")
  @Valid
  private List<String> skipUserConsentClientIds = null;

  @JsonProperty("client_url")
  private String clientUrl;

  @JsonProperty("backchannel_logout_uri")
  private String backchannelLogoutUri;

  @JsonProperty("mid_settings")
  private ClientMidSettings midSettings;

  @JsonProperty("smartid_settings")
  private ClientSmartIdSettings smartidSettings;

  @JsonProperty("client_contacts")
  @Valid
  private List<ClientContact> clientContacts = null;

  @JsonProperty("created_at")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime createdAt;

  @JsonProperty("updated_at")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime updatedAt;

  @JsonProperty("client_logo")
  private byte[] clientLogo;

  public Client id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  
  @Schema(name = "id", required = false)
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Client clientId(String clientId) {
    this.clientId = clientId;
    return this;
  }

  /**
   * Get clientId
   * @return clientId
  */
  @NotNull @Pattern(regexp = "^(?!\\s*$).+") @Size(min = 3, max = 255) 
  @Schema(name = "client_id", example = "openIdDemo", required = true)
  public String getClientId() {
    return clientId;
  }

  public void setClientId(String clientId) {
    this.clientId = clientId;
  }

  public Client clientName(NameTranslations clientName) {
    this.clientName = clientName;
    return this;
  }

  /**
   * Get clientName
   * @return clientName
  */
  @Valid 
  @Schema(name = "client_name", required = false)
  public NameTranslations getClientName() {
    return clientName;
  }

  public void setClientName(NameTranslations clientName) {
    this.clientName = clientName;
  }

  public Client clientShortName(ShortNameTranslations clientShortName) {
    this.clientShortName = clientShortName;
    return this;
  }

  /**
   * Get clientShortName
   * @return clientShortName
  */
  @Valid 
  @Schema(name = "client_short_name", required = false)
  public ShortNameTranslations getClientShortName() {
    return clientShortName;
  }

  public void setClientShortName(ShortNameTranslations clientShortName) {
    this.clientShortName = clientShortName;
  }

  public Client clientSecretExportSettings(ClientSecretExportSettings clientSecretExportSettings) {
    this.clientSecretExportSettings = clientSecretExportSettings;
    return this;
  }

  /**
   * Get clientSecretExportSettings
   * @return clientSecretExportSettings
  */
  @Valid 
  @Schema(name = "client_secret_export_settings", required = false)
  public ClientSecretExportSettings getClientSecretExportSettings() {
    return clientSecretExportSettings;
  }

  public void setClientSecretExportSettings(ClientSecretExportSettings clientSecretExportSettings) {
    this.clientSecretExportSettings = clientSecretExportSettings;
  }

  public Client institutionMetainfo(InstitutionMetainfo institutionMetainfo) {
    this.institutionMetainfo = institutionMetainfo;
    return this;
  }

  /**
   * Get institutionMetainfo
   * @return institutionMetainfo
  */
  @NotNull @Valid 
  @Schema(name = "institution_metainfo", required = true)
  public InstitutionMetainfo getInstitutionMetainfo() {
    return institutionMetainfo;
  }

  public void setInstitutionMetainfo(InstitutionMetainfo institutionMetainfo) {
    this.institutionMetainfo = institutionMetainfo;
  }

  public Client redirectUris(List<String> redirectUris) {
    this.redirectUris = redirectUris;
    return this;
  }

  public Client addRedirectUrisItem(String redirectUrisItem) {
    if (this.redirectUris == null) {
      this.redirectUris = new ArrayList<>();
    }
    this.redirectUris.add(redirectUrisItem);
    return this;
  }

  /**
   * Get redirectUris
   * @return redirectUris
  */
  @NotNull @Size(min = 1) 
  @Schema(name = "redirect_uris", required = true)
  public List<String> getRedirectUris() {
    return redirectUris;
  }

  public void setRedirectUris(List<String> redirectUris) {
    this.redirectUris = redirectUris;
  }

  public Client postLogoutRedirectUris(List<String> postLogoutRedirectUris) {
    this.postLogoutRedirectUris = postLogoutRedirectUris;
    return this;
  }

  public Client addPostLogoutRedirectUrisItem(String postLogoutRedirectUrisItem) {
    if (this.postLogoutRedirectUris == null) {
      this.postLogoutRedirectUris = new ArrayList<>();
    }
    this.postLogoutRedirectUris.add(postLogoutRedirectUrisItem);
    return this;
  }

  /**
   * Get postLogoutRedirectUris
   * @return postLogoutRedirectUris
  */
  @Size(min = 1) 
  @Schema(name = "post_logout_redirect_uris", required = false)
  public List<String> getPostLogoutRedirectUris() {
    return postLogoutRedirectUris;
  }

  public void setPostLogoutRedirectUris(List<String> postLogoutRedirectUris) {
    this.postLogoutRedirectUris = postLogoutRedirectUris;
  }

  public Client scope(List<String> scope) {
    this.scope = scope;
    return this;
  }

  public Client addScopeItem(String scopeItem) {
    if (this.scope == null) {
      this.scope = new ArrayList<>();
    }
    this.scope.add(scopeItem);
    return this;
  }

  /**
   * Get scope
   * @return scope
  */
  @NotNull @Size(min = 1) 
  @Schema(name = "scope", required = true)
  public List<String> getScope() {
    return scope;
  }

  public void setScope(List<String> scope) {
    this.scope = scope;
  }

  public Client secret(String secret) {
    this.secret = secret;
    return this;
  }

  /**
   * Get secret
   * @return secret
  */
  
  @Schema(name = "secret", required = false)
  public String getSecret() {
    return secret;
  }

  public void setSecret(String secret) {
    this.secret = secret;
  }

  public Client eidasRequesterId(String eidasRequesterId) {
    this.eidasRequesterId = eidasRequesterId;
    return this;
  }

  /**
   * Get eidasRequesterId
   * @return eidasRequesterId
  */
  @Pattern(regexp = "^((?!urn:uuid:)[a-zA-Z][a-zA-Z0-9+.-]*:.*|urn:uuid:[a-fA-F0-9]{8}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{12})$") @Size(max = 1024) 
  @Schema(name = "eidas_requester_id", example = "urn:uuid:33ca0ae1-a5fb-4885-80d7-6af6bf6e0e5f", required = false)
  public String getEidasRequesterId() {
    return eidasRequesterId;
  }

  public void setEidasRequesterId(String eidasRequesterId) {
    this.eidasRequesterId = eidasRequesterId;
  }

  public Client description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
  */
  @Size(min = 3, max = 4000) 
  @Schema(name = "description", required = false)
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Client infoNotificationEmails(List<String> infoNotificationEmails) {
    this.infoNotificationEmails = infoNotificationEmails;
    return this;
  }

  public Client addInfoNotificationEmailsItem(String infoNotificationEmailsItem) {
    if (this.infoNotificationEmails == null) {
      this.infoNotificationEmails = new ArrayList<>();
    }
    this.infoNotificationEmails.add(infoNotificationEmailsItem);
    return this;
  }

  /**
   * Get infoNotificationEmails
   * @return infoNotificationEmails
  */
  
  @Schema(name = "info_notification_emails", required = false)
  public List<String> getInfoNotificationEmails() {
    return infoNotificationEmails;
  }

  public void setInfoNotificationEmails(List<String> infoNotificationEmails) {
    this.infoNotificationEmails = infoNotificationEmails;
  }

  public Client slaNotificationEmails(List<String> slaNotificationEmails) {
    this.slaNotificationEmails = slaNotificationEmails;
    return this;
  }

  public Client addSlaNotificationEmailsItem(String slaNotificationEmailsItem) {
    if (this.slaNotificationEmails == null) {
      this.slaNotificationEmails = new ArrayList<>();
    }
    this.slaNotificationEmails.add(slaNotificationEmailsItem);
    return this;
  }

  /**
   * Get slaNotificationEmails
   * @return slaNotificationEmails
  */
  
  @Schema(name = "sla_notification_emails", required = false)
  public List<String> getSlaNotificationEmails() {
    return slaNotificationEmails;
  }

  public void setSlaNotificationEmails(List<String> slaNotificationEmails) {
    this.slaNotificationEmails = slaNotificationEmails;
  }

  public Client isUserConsentRequired(Boolean isUserConsentRequired) {
    this.isUserConsentRequired = isUserConsentRequired;
    return this;
  }

  /**
   * Get isUserConsentRequired
   * @return isUserConsentRequired
  */
  
  @Schema(name = "is_user_consent_required", example = "false", required = false)
  public Boolean getIsUserConsentRequired() {
    return isUserConsentRequired;
  }

  public void setIsUserConsentRequired(Boolean isUserConsentRequired) {
    this.isUserConsentRequired = isUserConsentRequired;
  }

  public Client skipUserConsentClientIds(List<String> skipUserConsentClientIds) {
    this.skipUserConsentClientIds = skipUserConsentClientIds;
    return this;
  }

  public Client addSkipUserConsentClientIdsItem(String skipUserConsentClientIdsItem) {
    if (this.skipUserConsentClientIds == null) {
      this.skipUserConsentClientIds = new ArrayList<>();
    }
    this.skipUserConsentClientIds.add(skipUserConsentClientIdsItem);
    return this;
  }

  /**
   * Get skipUserConsentClientIds
   * @return skipUserConsentClientIds
  */
  
  @Schema(name = "skip_user_consent_client_ids", required = false)
  public List<String> getSkipUserConsentClientIds() {
    return skipUserConsentClientIds;
  }

  public void setSkipUserConsentClientIds(List<String> skipUserConsentClientIds) {
    this.skipUserConsentClientIds = skipUserConsentClientIds;
  }

  public Client clientUrl(String clientUrl) {
    this.clientUrl = clientUrl;
    return this;
  }

  /**
   * Get clientUrl
   * @return clientUrl
  */
  
  @Schema(name = "client_url", example = "https://client.example.com/", required = false)
  public String getClientUrl() {
    return clientUrl;
  }

  public void setClientUrl(String clientUrl) {
    this.clientUrl = clientUrl;
  }

  public Client backchannelLogoutUri(String backchannelLogoutUri) {
    this.backchannelLogoutUri = backchannelLogoutUri;
    return this;
  }

  /**
   * Get backchannelLogoutUri
   * @return backchannelLogoutUri
  */
  
  @Schema(name = "backchannel_logout_uri", example = "https://example.com/", required = false)
  public String getBackchannelLogoutUri() {
    return backchannelLogoutUri;
  }

  public void setBackchannelLogoutUri(String backchannelLogoutUri) {
    this.backchannelLogoutUri = backchannelLogoutUri;
  }

  public Client midSettings(ClientMidSettings midSettings) {
    this.midSettings = midSettings;
    return this;
  }

  /**
   * Get midSettings
   * @return midSettings
  */
  @Valid 
  @Schema(name = "mid_settings", required = false)
  public ClientMidSettings getMidSettings() {
    return midSettings;
  }

  public void setMidSettings(ClientMidSettings midSettings) {
    this.midSettings = midSettings;
  }

  public Client smartidSettings(ClientSmartIdSettings smartidSettings) {
    this.smartidSettings = smartidSettings;
    return this;
  }

  /**
   * Get smartidSettings
   * @return smartidSettings
  */
  @Valid 
  @Schema(name = "smartid_settings", required = false)
  public ClientSmartIdSettings getSmartidSettings() {
    return smartidSettings;
  }

  public void setSmartidSettings(ClientSmartIdSettings smartidSettings) {
    this.smartidSettings = smartidSettings;
  }

  public Client clientContacts(List<ClientContact> clientContacts) {
    this.clientContacts = clientContacts;
    return this;
  }

  public Client addClientContactsItem(ClientContact clientContactsItem) {
    if (this.clientContacts == null) {
      this.clientContacts = new ArrayList<>();
    }
    this.clientContacts.add(clientContactsItem);
    return this;
  }

  /**
   * Get clientContacts
   * @return clientContacts
  */
  @Valid 
  @Schema(name = "client_contacts", required = false)
  public List<ClientContact> getClientContacts() {
    return clientContacts;
  }

  public void setClientContacts(List<ClientContact> clientContacts) {
    this.clientContacts = clientContacts;
  }

  public Client createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Get createdAt
   * @return createdAt
  */
  @Valid 
  @Schema(name = "created_at", example = "2019-08-24T14:15:22Z", required = false)
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public Client updatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * Get updatedAt
   * @return updatedAt
  */
  @Valid 
  @Schema(name = "updated_at", example = "2019-08-24T14:15:22Z", required = false)
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  public Client clientLogo(byte[] clientLogo) {
    this.clientLogo = clientLogo;
    return this;
  }

  /**
   * Get clientLogo
   * @return clientLogo
  */
  
  @Schema(name = "client_logo", required = false)
  public byte[] getClientLogo() {
    return clientLogo;
  }

  public void setClientLogo(byte[] clientLogo) {
    this.clientLogo = clientLogo;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Client client = (Client) o;
    return Objects.equals(this.id, client.id) &&
        Objects.equals(this.clientId, client.clientId) &&
        Objects.equals(this.clientName, client.clientName) &&
        Objects.equals(this.clientShortName, client.clientShortName) &&
        Objects.equals(this.clientSecretExportSettings, client.clientSecretExportSettings) &&
        Objects.equals(this.institutionMetainfo, client.institutionMetainfo) &&
        Objects.equals(this.redirectUris, client.redirectUris) &&
        Objects.equals(this.postLogoutRedirectUris, client.postLogoutRedirectUris) &&
        Objects.equals(this.scope, client.scope) &&
        Objects.equals(this.secret, client.secret) &&
        Objects.equals(this.eidasRequesterId, client.eidasRequesterId) &&
        Objects.equals(this.description, client.description) &&
        Objects.equals(this.infoNotificationEmails, client.infoNotificationEmails) &&
        Objects.equals(this.slaNotificationEmails, client.slaNotificationEmails) &&
        Objects.equals(this.isUserConsentRequired, client.isUserConsentRequired) &&
        Objects.equals(this.skipUserConsentClientIds, client.skipUserConsentClientIds) &&
        Objects.equals(this.clientUrl, client.clientUrl) &&
        Objects.equals(this.backchannelLogoutUri, client.backchannelLogoutUri) &&
        Objects.equals(this.midSettings, client.midSettings) &&
        Objects.equals(this.smartidSettings, client.smartidSettings) &&
        Objects.equals(this.clientContacts, client.clientContacts) &&
        Objects.equals(this.createdAt, client.createdAt) &&
        Objects.equals(this.updatedAt, client.updatedAt) &&
        Arrays.equals(this.clientLogo, client.clientLogo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, clientId, clientName, clientShortName, clientSecretExportSettings, institutionMetainfo, redirectUris, postLogoutRedirectUris, scope, secret, eidasRequesterId, description, infoNotificationEmails, slaNotificationEmails, isUserConsentRequired, skipUserConsentClientIds, clientUrl, backchannelLogoutUri, midSettings, smartidSettings, clientContacts, createdAt, updatedAt, Arrays.hashCode(clientLogo));
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Client {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    clientName: ").append(toIndentedString(clientName)).append("\n");
    sb.append("    clientShortName: ").append(toIndentedString(clientShortName)).append("\n");
    sb.append("    clientSecretExportSettings: ").append(toIndentedString(clientSecretExportSettings)).append("\n");
    sb.append("    institutionMetainfo: ").append(toIndentedString(institutionMetainfo)).append("\n");
    sb.append("    redirectUris: ").append(toIndentedString(redirectUris)).append("\n");
    sb.append("    postLogoutRedirectUris: ").append(toIndentedString(postLogoutRedirectUris)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
    sb.append("    eidasRequesterId: ").append(toIndentedString(eidasRequesterId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    infoNotificationEmails: ").append(toIndentedString(infoNotificationEmails)).append("\n");
    sb.append("    slaNotificationEmails: ").append(toIndentedString(slaNotificationEmails)).append("\n");
    sb.append("    isUserConsentRequired: ").append(toIndentedString(isUserConsentRequired)).append("\n");
    sb.append("    skipUserConsentClientIds: ").append(toIndentedString(skipUserConsentClientIds)).append("\n");
    sb.append("    clientUrl: ").append(toIndentedString(clientUrl)).append("\n");
    sb.append("    backchannelLogoutUri: ").append(toIndentedString(backchannelLogoutUri)).append("\n");
    sb.append("    midSettings: ").append(toIndentedString(midSettings)).append("\n");
    sb.append("    smartidSettings: ").append(toIndentedString(smartidSettings)).append("\n");
    sb.append("    clientContacts: ").append(toIndentedString(clientContacts)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    clientLogo: ").append(toIndentedString(clientLogo)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

