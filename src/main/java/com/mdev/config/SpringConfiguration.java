package com.mdev.config;

import com.mdev.classes.ThirdClass;
import com.mdev.classes.TimeConsumingClass;
import com.mdev.classes.FirstClass;
import com.mdev.classes.TimeLogging;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Scope;

@Configuration
public class SpringConfiguration {
    @Configuration
    @EnableAspectJAutoProxy
    public class SpringConfig {
        @Bean
        public FirstClass fc() {
            return new FirstClass();
        }

        @Bean
        public TimeConsumingClass tcc() {
            return new TimeConsumingClass();
        }

        @Bean
        @Scope(value = "singleton")
        public TimeLogging tl() {
            return new TimeLogging();
        }

        @Bean
        public ThirdClass tc() {
            return new ThirdClass(fc(), tcc());
        }

    }
}
