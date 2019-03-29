package com.hibernate.assignment.hibernateassignment.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Address {

    @Id
    Integer id;
    Integer streetNumber;
    String location;
    String state;
    
    public Address() {
    }
    
    public Address(Integer id, Integer streetNumber, String location, String state) {
        this.id = id;
        this.streetNumber = streetNumber;
        this.location = location;
        this.state = state;
    }
    
    public Integer getId() {
        return id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    
    public Integer getStreetNumber() {
        return streetNumber;
    }
    
    public void setStreetNumber(Integer streetNumber) {
        this.streetNumber = streetNumber;
    }
    
    public String getLocation() {
        return location;
    }
    
    public void setLocation(String location) {
        this.location = location;
    }
    
    public String getState() {
        return state;
    }
    
    public void setState(String state) {
        this.state = state;
    }
    
    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", streetNumber=" + streetNumber +
                ", location='" + location + '\'' +
                ", state='" + state + '\'' +
                '}';
    }
}
