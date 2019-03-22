package com.practice.withoutJDBC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLException;

public class UserDaoServiceMain {
    
    public static void main(String[] args) throws SQLException {
    
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("data-source-config.xml");
        
        UserDaoService userDaoService = (UserDaoService) applicationContext.getBean("userdao");
        
        userDaoService.printUserNames();
        
        userDaoService.printSingleConnectionUserName();
        
        userDaoService.printPooledConnectionUserName();
    }
}
