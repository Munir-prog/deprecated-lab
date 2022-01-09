package com.mdev.aspects;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.PreDestroy;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

@Aspect
public class TimingAspect {

    private static final Logger logger = LoggerFactory.getLogger(LoggingAspect.class);
    private static final Map<String, Double> result = new TreeMap<>();

    @Around("within(com.mdev.service..*)")
    public Object timeCounter(ProceedingJoinPoint joinPoint) throws Throwable {
        String name = getName(
                joinPoint.getTarget().getClass().getSimpleName(),
                joinPoint.getSignature().getName()
        );
        double start = System.currentTimeMillis() / (double) 1000;
        Object methodReturnType = joinPoint.proceed();
        double end = System.currentTimeMillis() / (double) 1000;
        result.put(name, end - start);
        return methodReturnType;
    }

    @PreDestroy
    public void exit() {
        System.out.println("Result:");
        result.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .forEach(value -> {
                    logger.info("{} Time: {}", value.getKey(), value.getValue());
                });
    }

    private String getName(String simpleName, String name) {
        return "Class: " + simpleName + ", method: " + name;
    }

}