package entity;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Id;

@Embeddable
public class Address {

    Integer streetNumber;
    String location;
    String state;
    
    public Address() {
    }
    
    public Address(Integer streetNumber, String location, String state) {
        this.streetNumber = streetNumber;
        this.location = location;
        this.state = state;
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
                ", streetNumber=" + streetNumber +
                ", location='" + location + '\'' +
                ", state='" + state + '\'' +
                '}';
    }
}
