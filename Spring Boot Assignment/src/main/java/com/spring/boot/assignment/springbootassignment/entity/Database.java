package com.spring.boot.assignment.springbootassignment.entity;

public class Database {
    private Integer port;
    private String name;
    private String username;
    private String password;
    
    @Override
    public String toString() {
        return "Database{" +
                "port=" + port +
                ", name='" + name + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
    
    public String getUsername() {
        return username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }
    
    public String getPassword() {
        return password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    
    public Database(Integer port, String name, String username, String password) {
        this.port = port;
        this.name = name;
        this.username = username;
        this.password = password;
    }
    
    public Integer getPort() {
        return port;
    }
    
    public void setPort(Integer port) {
        this.port = port;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public Database() {
    }
    
    public Database(Integer port, String name) {
        this.port = port;
        this.name = name;
    }
}
