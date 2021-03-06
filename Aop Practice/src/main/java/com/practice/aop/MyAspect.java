package com.practice.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyAspect {

    
    @Before("execution(void display())")
    void beforeAdvice(){
        System.out.println("Before advice is invoked.");
    }

    @Before("execution(void m*())")
    void beforemAdvice(){
        System.out.println("Before advice for m methods is invoked.");
    }
}
