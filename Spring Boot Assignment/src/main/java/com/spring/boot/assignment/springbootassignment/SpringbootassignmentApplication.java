package com.spring.boot.assignment.springbootassignment;

import com.spring.boot.assignment.springbootassignment.entity.Database;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan("com.spring.boot.assignment.springbootassignment.entity")
@EnableJpaRepositories("com.spring.boot.assignment.springbootassignment.repository")
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
