package com.practice.jdbcTemplate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    
    public static void main(String[] args) {
//        JDBCTemplateUserDao jdbcTemplateUserDao = new JDBCTemplateUserDao();
    
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("exercise1-config.xml");
        JDBCTemplateUserDao jdbcTemplateUserDao = applicationContext.getBean(JDBCTemplateUserDao.class);
        jdbcTemplateUserDao.print();
    }
}
