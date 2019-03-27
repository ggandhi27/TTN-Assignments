package com.rest.assignment.restassignment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.rest.assignment.restassignment.repository")
@EntityScan(basePackages = "com.rest.assignment.restassignment.entity")
public class RestassignmentApplication {

    public static void main(String[] args) {
        SpringApplication.run(RestassignmentApplication.class, args);
    }

}
