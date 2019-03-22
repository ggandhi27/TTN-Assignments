package com.practice.exercise1;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.datasource.SingleConnectionDataSource;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@Service
public class UserDaoService {
    
    @Autowired
    DataSource dataSource;
    
    @Autowired
    SingleConnectionDataSource singleConnectionDataSource;
    
    @Autowired
    BasicDataSource basicDataSource;
    
    void print(Connection connection) throws SQLException {
    
        PreparedStatement preparedStatement = connection.prepareStatement("select * from user");
        ResultSet resultSet = preparedStatement.executeQuery();
        
        while (resultSet.next()){
            System.out.println("UserName\t:: "+resultSet.getString(1));
            System.out.println("Password\t:: "+resultSet.getString(2));
            System.out.println("Name\t:: "+resultSet.getString(3));
            System.out.println("Age\t:: "+resultSet.getString(4));
            System.out.println("DOB\t:: "+resultSet.getString(5));
        }
    }
    
    void printDataSource() throws SQLException {
        Connection connection = dataSource.getConnection();
        this.print(connection);
    }
    
    void printSingleConnectionDataSource()throws SQLException {
        Connection connection = singleConnectionDataSource.getConnection();
        this.print(connection);
    }
    
    void printBasicDataSource() throws SQLException {
        Connection connection = basicDataSource.getConnection();
        this.print(connection);
    }
}
