package com.spring.boot.assignment.springbootassignment.controller;

import com.spring.boot.assignment.springbootassignment.entity.Database;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DatabaseController {
    
    @Autowired
    Database database;
    
    @GetMapping("/getdb")
    public String getdb() {
        return  database.toString();
    }
    
}
