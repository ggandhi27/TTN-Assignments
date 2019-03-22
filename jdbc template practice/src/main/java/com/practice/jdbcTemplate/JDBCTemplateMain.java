package com.practice.jdbcTemplate;

import com.practice.jdbcTemplate.entity.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JDBCTemplateMain {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");
        
        JDBCTemplateUserDao jdbcTemplateUserDao = applicationContext.getBean(JDBCTemplateUserDao.class);
        
        jdbcTemplateUserDao.userCount();
        jdbcTemplateUserDao.getUserName();
    
        User user = new User();
        user.setUsername("something");
        user.setPassword("12345656");
        user.setName("someone");
        user.setAge(36);
        user.setDob("12/08/1996");
        
        jdbcTemplateUserDao.insertUser(user);
        
        jdbcTemplateUserDao.userCount();
        
        jdbcTemplateUserDao.getUserRow();
        
        jdbcTemplateUserDao.getUserList();
        
        jdbcTemplateUserDao.getUser();
        
        jdbcTemplateUserDao.getNamedParameteTemplateDao();
    }
}
