package com.event.handling.context;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainDriver2 {
    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config-2.xml");
        
        applicationContext.start();
        applicationContext.refresh();
        applicationContext.stop();
        applicationContext.close();
    }
}
