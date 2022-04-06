package ee.ria.tara.configuration.providers;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

@Getter
@Setter
@Validated
@Configuration
@ConfigurationProperties(prefix = "tara.admin.security")
public class SecurityConfigurationProperties {

    private static final String DEFAULT_CONTENT_SECURITY_POLICY = "connect-src 'self'; " +
            "default-src 'none'; " +
            "font-src 'self'; " +
            "img-src 'self'; " +
            "script-src 'self'; " +
            "style-src 'self'; " +
            "base-uri 'none'; " +
            "frame-ancestors 'none'; " +
            "block-all-mixed-content";

    @NotBlank
    String contentSecurityPolicy = DEFAULT_CONTENT_SECURITY_POLICY;

    @Min(value = -1)
    int cookieMaxAgeSeconds = 3600;
}
