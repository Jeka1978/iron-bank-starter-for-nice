package com.nice.ironbankstarterfornice;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author Evgeny Borisov
 */

public class ProfileSentinelApplicationContextInitializer implements ApplicationContextInitializer {
    @Override
    public void initialize(ConfigurableApplicationContext context) {
        if (context.getEnvironment().getActiveProfiles().length == 0) {
            throw new IllegalStateException("can't work without profile");
        }
    }
}
