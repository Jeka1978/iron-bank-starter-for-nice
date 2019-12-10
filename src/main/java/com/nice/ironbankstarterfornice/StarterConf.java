package com.nice.ironbankstarterfornice;

import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author Evgeny Borisov
 */
@Configuration
@EnableScheduling
@EnableConfigurationProperties(RavenProps.class)
public class StarterConf {


    @Bean
    @ConditionalOnProd
    @ConditionalOnProperty("raven.destination")
    public ExceptionHandlerAspect exceptionHandlerAspect(){
        return new ExceptionHandlerAspect();
    }









    @Bean
    public HelloService helloService(){
        return new HelloService();
    }
}
