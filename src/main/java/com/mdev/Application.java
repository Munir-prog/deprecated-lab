package com.mdev;

import com.mdev.classes.TestMethods;
import com.mdev.classes.ThirdClass;
import com.mdev.config.ConfigurationLog;
import com.mdev.config.SpringConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {


    public static void main(String[] args) {
        var x = new AnnotationConfigApplicationContext(ConfigurationLog.class, SpringConfiguration.class);
        var bean = x.getBean("smclass", TestMethods.class);
        bean.doSomething();
        bean.sheesh();
        second(x);
    }

    public static void second(AnnotationConfigApplicationContext x) {
        var bean = x.getBean("tc", ThirdClass.class);
        bean.entrypoint();
        x.close();
    }

}