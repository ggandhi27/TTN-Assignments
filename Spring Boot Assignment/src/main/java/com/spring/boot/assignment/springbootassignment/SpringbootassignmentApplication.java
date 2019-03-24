package com.spring.boot.assignment.springbootassignment;

import com.spring.boot.assignment.springbootassignment.entity.Database;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringbootassignmentApplication {
    
    @Value("${database.port}")
    Integer port;
    
    @Value("${database.name}")
    String name;
    
    @Value("${database.username}")
    String username;
    
    @Value("${database.password}")
    String password;
    
    @Bean
    public Database database() {
        return new Database(this.port,this.name,this.username,this.password);
    }
    
    @Autowired
    Database data;
    
    public static void main(String[] args) {
        SpringApplication.run(SpringbootassignmentApplication.class, args);
    }
    
}
