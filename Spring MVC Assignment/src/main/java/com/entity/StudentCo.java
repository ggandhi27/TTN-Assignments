package com.entity;

public class StudentCo {
    private String firstname;
    private String lastname;
    
    @Override
    public String toString() {
        return "StudentCo{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                '}';
    }
    
    public String getFirstname() {
        return firstname;
    }
    
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    
    public String getLastname() {
        return lastname;
    }
    
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    
    public StudentCo(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }
}
