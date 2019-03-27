package com.rest.assignment.restassignment.entity;

public class StudentV1 {
    
    private String name;
    
    public StudentV1() {
    }
    
    public StudentV1(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    @Override
    public String toString() {
        return "StudentV1{" +
                "name='" + name + '\'' +
                '}';
    }
}
