package com.practice.jdbcTemplate.exercise2;

import com.practice.jdbcTemplate.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Exercise2Main {
    
//    @Autowired
//    static  Exercise2Dao exercise2Dao;
    
    public static void main(String[] args) {
    
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");
        
        Exercise2Dao exercise2Dao = applicationContext.getBean(Exercise2Dao.class);
        
        exercise2Dao.getUserCount();
        
        exercise2Dao.getName();
    
        User user;
        user = new User();
        
        user.setUsername("acbv");
        user.setPassword("12e3");
        user.setName("hvfihvivir");
        user.setAge(36);
        user.setDob("30/5/9955");
        exercise2Dao.insertUser(user);
        
        exercise2Dao.getUserCount();
        
        exercise2Dao.fetchUserDetails();
        
        exercise2Dao.getAllUsers();
        
        exercise2Dao.getUserMapper();
    }
}
