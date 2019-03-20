package com.event.handling.custom;

import org.springframework.context.ApplicationListener;

public class CustomEventListener implements ApplicationListener<CustomEvent> {
    @Override
    public void onApplicationEvent(CustomEvent event) {
        System.out.println("Custom Event invoked");
        System.out.println(event.getSource());
    }
}
