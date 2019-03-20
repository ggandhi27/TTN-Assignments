package com.event.handling.context;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainDriver{
    public static void main(String[] args) {
    
        ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");
        applicationContext.start();
        
        Dummy dummy = (Dummy) applicationContext.getBean("dummy");
        applicationContext.refresh();
        dummy.display();
        
        applicationContext.stop();
        applicationContext.close();
    }
}
