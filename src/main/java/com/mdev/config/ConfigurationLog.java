package com.mdev.config;

import com.mdev.classes.TestMethods;
import com.mdev.log.DeprecatedLog;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigurationLog {

    @Bean
    public DeprecatedLog logging() {
        return new DeprecatedLog();
    }
    @Bean
    public TestMethods smclass() {
        return new TestMethods();
    }
}
