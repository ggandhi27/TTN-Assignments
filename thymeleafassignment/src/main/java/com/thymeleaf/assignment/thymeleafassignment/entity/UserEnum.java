package com.thymeleaf.assignment.thymeleafassignment.entity;

public enum UserEnum {
    USER("USER"),ADMIN("ADMIN"),SUPER_ADMIN("SUPER_ADMIN");
    String value;
    UserEnum(String user) {
        value = user;
    }
    
    public String getValue() {
        return value;
    }
}
