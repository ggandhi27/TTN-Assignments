package com.rest.assignment.restassignment.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.GeneratorType;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "student")
@JsonIgnoreProperties(value = "id")
public class Student {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Size(min = 2,message = "Student name should contain at least 2 characters.")
    private String name;
    
    private String city;
    private Integer age;
    private Integer standard;
    private Double percentage;
    
    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", age=" + age +
                ", standard=" + standard +
                ", percentage=" + percentage +
                '}';
    }
    
    public Double getPercentage() {
        return percentage;
    }
    
    public void setPercentage(Double percentage) {
        this.percentage = percentage;
    }
    
    public Student(String name, String city, Integer age, Integer standard, Double percentage) {
        this.name = name;
        this.city = city;
        this.age = age;
        this.standard = standard;
        this.percentage = percentage;
    }
    
    public Student() {
    }
    
    public Student(String name, String city, Integer age, Integer standard) {
        this.name = name;
        this.city = city;
        this.age = age;
        this.standard = standard;
    }
    
    public Integer getId() {
        return id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getCity() {
        return city;
    }
    
    public void setCity(String city) {
        this.city = city;
    }
    
    public Integer getAge() {
        return age;
    }
    
    public void setAge(Integer age) {
        this.age = age;
    }
    
    public Integer getStandard() {
        return standard;
    }
    
    public void setStandard(Integer standard) {
        this.standard = standard;
    }
    
}
