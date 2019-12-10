package com.nice.ironbankstarterfornice;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author Evgeny Borisov
 */
@Data
@ConfigurationProperties("raven")
public class RavenProps {
    private String destination;
    private boolean enabled;
}
