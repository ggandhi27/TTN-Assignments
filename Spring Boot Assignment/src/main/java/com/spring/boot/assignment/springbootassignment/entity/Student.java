package com.spring.boot.assignment.springbootassignment.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student")
public class Student {
    
    @Id
    private Integer stuid;
    
    @Override
    public String toString() {
        return "Student{" +
                "stuid=" + stuid +
                ", id='" + id + '\'' +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                '}';
    }
    
    public Integer getStuid() {
        return stuid;
    }
    
    public void setStuid(Integer stuid) {
        this.stuid = stuid;
    }
    
    public Student(Integer stuid, String id, String firstname, String lastname) {
        this.stuid = stuid;
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
    }
    
    private String id;
    private String firstname;
    private String lastname;
    
    public Student() {
    }
    
    public Student(String id, String firstname, String lastname) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
    }
    
    public String getId() {
        return id;
    }
    
    public void setId(String id) {
        this.id = id;
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
    
}
