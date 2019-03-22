package com.practice.jdbcTemplate.exercise2;

import com.practice.jdbcTemplate.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
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
public class Exercise2Dao {
    
    @Autowired
    DataSource dataSource;
    
    @Autowired
    JdbcTemplate jdbcTemplate;
    
    @Autowired
    NamedParameterJdbcTemplate namedParameterJdbcTemplate;
    
    void getUserCount(){
        String sql = "SELECT COUNT(*) FROM user";
        System.out.println(jdbcTemplate.queryForObject(sql,Integer.class));
    }
    
    void getName(){
        String sql = "SELECT name FROM user WHERE username = ?";
    
        System.out.println(jdbcTemplate.queryForObject(sql,new Object[]{"ggandhi"},String.class));
    }
    
    void insertUser(User user) {
        String sql = "INSERT INTO user (username,password,name,age,dob) values (?,?,?,?,?)";
        
        jdbcTemplate.update(sql,new Object[]{user.getUsername(),user.getPassword(),
        user.getName(),user.getAge(),user.getDob()});
    }
    
    void fetchUserDetails() {
        
        String sql = "SELECT * FROM user WHERE username = ?";
    
        System.out.println(jdbcTemplate.queryForMap(sql,new Object[]{"ggandhi"}));
    }
    
    void getAllUsers() {
        
        String sql = "SELECT * FROM user";
    
        System.out.println(jdbcTemplate.queryForList(sql));
    }
    
    void getUserMapper(){
        String sql = "SELECT * FROM user WHERE username = ?";
    
        System.out.println(jdbcTemplate.queryForObject(sql,new Object[]{"ggandhi"},new UserMapper()));
    }
}
