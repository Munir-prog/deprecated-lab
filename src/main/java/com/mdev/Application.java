package com.mdev;

import com.mdev.config.SpringConfiguration;
import com.mdev.service.BusinessLogic;
import com.mdev.service.TimerMethods;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(SpringConfiguration.class)) {
            var businessLogic = context.getBean("logic", BusinessLogic.class);
            var timerMethods = context.getBean("timerMethods", TimerMethods.class);
            businessLogic.sayHello();
            businessLogic.sayHello10();
            timerMethods.startMethods();
        }
    }
}