package com.practice.spel.springBeans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpelMain {
    public static void main(String[] args) {
    
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spel-config.xml");
    
        SpelBean spelBean = (SpelBean) applicationContext.getBean("spelBean");
    
        System.out.println(spelBean);
        
    }
}
