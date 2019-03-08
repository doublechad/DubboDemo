package com.chad.aspect;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Aspect
@Component
public class LogAspect {

    /**
     *  execution(<方法修饰符>? <方法返回值类型> <包名>.<类名>.<方法名>(<参数类型>) [throws <异常类型>]?)
     */
    @Pointcut("execution(public * com.chad.controller.TestController.*(..))")
    public void checkip(){}

    @Around("execution(public * com.chad.controller.TestController.*(..))")
    public Object aroundMethod(ProceedingJoinPoint pjd) throws Throwable {
        System.out.println("ok");
        Object[] xxx =pjd.getArgs();
        Arrays.stream(xxx).forEach(System.out::println);
        xxx[0]="hello world";
        return pjd.proceed(xxx);

    }

}
