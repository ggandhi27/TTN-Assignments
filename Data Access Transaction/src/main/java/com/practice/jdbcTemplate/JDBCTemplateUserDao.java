package com.practice.jdbcTemplate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class JDBCTemplateUserDao {
    
    @Autowired
    JdbcTemplate jdbcTemplate;
    
    void print() {
        String sql = "select COUNT(*) from user";
    
        System.out.println(jdbcTemplate.queryForObject(sql,Integer.class));
    }
    
}
