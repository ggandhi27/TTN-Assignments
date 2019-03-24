package com.spring.boot.assignment.springbootassignment.service;

import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class Bootstrap {
    @EventListener(ApplicationStartedEvent.class)
    public void init() {
        System.out.println("Your application is up and running.");
    }
    
}
