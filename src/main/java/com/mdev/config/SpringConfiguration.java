package com.mdev.config;

import com.mdev.aspects.LoggingAspect;
import com.mdev.service.BusinessLogic;
import com.mdev.aspects.TimingAspect;
import com.mdev.service.ReversedSort;
import com.mdev.service.SimpleSort;
import com.mdev.service.TimerMethods;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("com.mdev")
@EnableAspectJAutoProxy
public class SpringConfiguration {

    @Bean
    public BusinessLogic logic() {
        return new BusinessLogic();
    }

    @Bean
    public TimerMethods timerMethods(){
        return new TimerMethods(simpleSort(), reversedSort());
    }

    @Bean
    public LoggingAspect logging() {
        return new LoggingAspect();
    }

    @Bean
    public SimpleSort simpleSort() {
        return new SimpleSort();
    }

    @Bean
    public ReversedSort reversedSort() {
        return new ReversedSort();
    }

    @Bean
    @Scope(value = "singleton")
    public TimingAspect tl() {
        return new TimingAspect();
    }

}
