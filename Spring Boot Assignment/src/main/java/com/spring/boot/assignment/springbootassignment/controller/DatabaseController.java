package com.spring.boot.assignment.springbootassignment.controller;

import com.spring.boot.assignment.springbootassignment.entity.Database;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DatabaseController {
    
    Logger logger = LoggerFactory.getLogger(DatabaseController.class);
    
    @Autowired
    Database database;
    
    @GetMapping("/getdb")
    public String getdb() {
        logger.trace("getdb method is invoked.");
        logger.debug("a debug msg for getdb");
        logger.info("This is a get db method.");
        logger.warn("A warning occurred in getdb.");
        logger.error("An error occurred. in getdb");
        return  database.toString();
    }
    
}
