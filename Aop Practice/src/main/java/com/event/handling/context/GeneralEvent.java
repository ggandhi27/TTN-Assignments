package com.event.handling.context;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

public class GeneralEvent implements ApplicationListener {
    @Override
    public void onApplicationEvent(ApplicationEvent event) {
        System.out.println("Application Event occurred.");
    }
}
