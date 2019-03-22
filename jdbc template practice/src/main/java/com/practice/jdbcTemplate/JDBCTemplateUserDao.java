package com.practice.jdbcTemplate;

import com.practice.jdbcTemplate.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;


class UserMapper implements RowMapper<User> {
    
    @Override
    public User mapRow(ResultSet rs, int rowNum) throws SQLException {
        User user = new User();
        
        user.setUsername(rs.getString(1));
        user.setPassword(rs.getString(2));
        user.setName(rs.getString(3));
        user.setAge(rs.getInt(4));
        user.setDob(rs.getString(5));
        return user;
    }
}

@Repository
public class JDBCTemplateUserDao {
    
    @Autowired
    DataSource dataSource;
    
    @Autowired
    JdbcTemplate jdbcTemplate;
    
    void userCount(){
        String sql = "SELECT COUNT(*) FROM user";
        System.out.println(jdbcTemplate.queryForObject(sql,Integer.class));
    }
    
    void getUserName(){
        String sql = "SELECT name FROM user WHERE username=?";
    
        System.out.println(jdbcTemplate.queryForObject(sql,new Object[]{"ggandhi"},String.class));
    }
    
    void insertUser(User user){
        
        String sql = "INSERT INTO user (username,password,name,age,dob) VALUES (?,?,?,?,?)";
        
        jdbcTemplate.update(sql,new Object[]{user.getUsername(),user.getPassword(),user.getName(),user.getAge(),user.getDob()});
    }
    
    void getUserRow(){
        
        String sql = "SELECT * FROM user WHERE username = ?";
    
        System.out.println(jdbcTemplate.queryForMap(sql,new Object[]{"ggandhi"}));
        
    }
    
    void getUserList(){
        String sql = "SELECT * FROM user";
        
        System.out.println(jdbcTemplate.queryForList(sql));
    }
    
    void getUser(){
        String sql = "SELECT * FROM user WHERE username = ?";
    
        System.out.println(jdbcTemplate.queryForObject(sql,new Object[]{"ggandhi"},new UserMapper()));
        
    }
}
