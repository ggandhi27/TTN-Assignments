package com.aop.practice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AopMain {
    public static void main(String[] args) {
    
        ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext("aop-config.xml");
        
        Dummy dummy = (Dummy) applicationContext.getBean("dummy");
        
        dummy.display();
        dummy.m1();
        dummy.m2();
        dummy.m3();
        dummy.m5();
        dummy.m6();
        dummy.m7();
        dummy.m8();
        dummy.m4();
    }
}
