package com.custom.event.handling;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CustomMain {
    public static void main(String[] args) {
//        DummyClass dummyClass= new DummyClass();
//       dummyClass.run();
        ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config-custom.xml");
        applicationContext.start();
       CustomEventPublisher customEventPublisher=applicationContext.getBean(CustomEventPublisher.class);
       customEventPublisher.publish();
//       applicationContext.stop();
//       applicationContext.close();
    }
}
