package com.practice.jdbcTemplate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;

@Repository
public class UserDao {
    
    @Autowired
    DataSource dataSource;
    
    @Autowired
    JdbcTemplate jdbcTemplate;
    
    void userCount(){
        String sql = "SELECT COUNT(*) FROM user";
        System.out.println(jdbcTemplate.queryForObject(sql,Integer.class));
    }
}
