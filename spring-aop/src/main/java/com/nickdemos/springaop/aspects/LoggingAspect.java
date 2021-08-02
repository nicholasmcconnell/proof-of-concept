package com.nickdemos.springaop.aspects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.cglib.core.Local;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;

@Aspect //spring does not see this -> you need @Componenet to rest can manage the @Aspect
@Component
public class LoggingAspect {

    private final Logger logger = LogManager.getLogger();

    @Pointcut("within(com.nickdemos.springaop..*)")
    public void logAll(){}
    @Before("logAll()")
    public void logMethodStart(JoinPoint jp){
        String methodSig = extractMethodSignature(jp);
        String argStr = Arrays.toString(jp.getArgs());
        logger.info("{} invoked at {}", methodSig, LocalDateTime.now());
        logger.info("Input agruments: {}", argStr);
    }

    @AfterReturning(pointcut = "logAll()", returning = "returnedObj")
    public void logMethodReturn(JoinPoint jp, Object returnedObj){
        String methodSig = extractMethodSignature(jp);
        logger.info("{} succesfully returned at {}", methodSig, LocalDateTime.now());
        logger.info("Object returned: {}", returnedObj);
    }

    @AfterThrowing(pointcut = "logAll()", throwing = "e")
    public void logMethodException(JoinPoint jp, Throwable e){
        String methodSig = extractMethodSignature(jp);
        logger.warn("{} was thrown in method {} at {} with message: {}", e.getClass().getSimpleName(), methodSig, LocalDateTime.now(), e.getMessage());
    }

    private String extractMethodSignature(JoinPoint jp){
       return jp.getTarget().getClass().toString() +"."+jp.getSignature().getName();
    }
}