package com.mdev.log;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
//@Slf4j
public class DeprecatedLog {
    private static final Logger logger = LoggerFactory.getLogger(DeprecatedLog.class);
    @Before("log()")
    public void logMethod(JoinPoint jp) {
        var classname = jp.getSignature().getDeclaringTypeName();
        var methodName = jp.getSignature().getName();
        logger.info("Log in {} method", "logMethod");
    }

    @Pointcut("@annotation(java.lang.Deprecated)")
    public void log() {
        logger.info("Method passed successfully");
    }
}