package com.rest.assignment.restassignment.entity;

public class Name {
    
    private String lastname;
    private String firstname;
    
    public Name() {
    }
    
    public Name(String lastname, String firstname) {
        this.lastname = lastname;
        this.firstname = firstname;
    }
    
    public String getLastname() {
        return lastname;
    }
    
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    
    public String getFirstname() {
        return firstname;
    }
    
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    
    @Override
    public String toString() {
        return "Name{" +
                "lastname='" + lastname + '\'' +
                ", firstname='" + firstname + '\'' +
                '}';
    }
}
