package com.thymeleaf.practice.thymeleafpractice.entity;

import javax.validation.constraints.NotNull;

public class User {
    
    @NotNull
    private String name;
    @NotNull
    private String password;
    
    public User() {
    }
    
    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getPassword() {
        return password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
}
