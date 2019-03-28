package com.thymeleaf.assignment.thymeleafassignment.entity;

public class Employee {
    
    private String firstname;
    private String lastname;
    private Integer salary;
    private Integer age;
    private String city;
    private String admin;
    
    public String getAdmin() {
        return admin;
    }
    
    public void setAdmin(String admin) {
        this.admin = admin;
    }
    
    public Employee(String firstname, String lastname, Integer salary, Integer age, String city, String admin) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.salary = salary;
        this.age = age;
        this.city = city;
        this.admin = admin;
    }
    
    public Employee() {
    }
    
    public Employee(String firstname, String lastname, Integer salary, Integer age, String city) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.salary = salary;
        this.age = age;
        this.city = city;
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
    
    public Integer getSalary() {
        return salary;
    }
    
    public void setSalary(Integer salary) {
        this.salary = salary;
    }
    
    public Integer getAge() {
        return age;
    }
    
    public void setAge(Integer age) {
        this.age = age;
    }
    
    public String getCity() {
        return city;
    }
    
    public void setCity(String city) {
        this.city = city;
    }
}
