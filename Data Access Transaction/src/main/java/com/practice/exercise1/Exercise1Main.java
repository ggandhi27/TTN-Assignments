package com.practice.exercise1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import java.sql.SQLException;

@Component
public class Exercise1Main {
    
    static UserDaoService userDaoService;
    
    public static void main(String[] args) throws SQLException {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("exercise1-config.xml");
        userDaoService = (UserDaoService) applicationContext.getBean("userDaoService");
        userDaoService.printDataSource();
        userDaoService.printSingleConnectionDataSource();
        userDaoService.printBasicDataSource();
    }
}
