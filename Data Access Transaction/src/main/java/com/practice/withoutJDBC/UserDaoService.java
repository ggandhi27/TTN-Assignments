package com.practice.withoutJDBC;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@Service
public class UserDaoService {
    
    @Autowired
    @Qualifier("datasource")    //@Qualifier is used to give the name of the bean with the different name as that of the variable name
    DataSource dataSource;
    
    @Autowired
    DataSource singleConnectionDataSource;
    
    @Autowired
    BasicDataSource basicDataSource;
    
    void print(Connection connection) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement("select * from user");
    
        ResultSet resultSet = preparedStatement.executeQuery();
    
        while (resultSet.next()){
            System.out.println(resultSet.getString("username"));
        }
        
    }
    
    void printUserNames() throws SQLException {
        Connection connection = dataSource.getConnection();
        this.print(connection);
    }
    
    void printSingleConnectionUserName() throws SQLException {
        Connection connection = singleConnectionDataSource.getConnection();
        this.print(connection);
    }
    
    void printPooledConnectionUserName() throws SQLException {
        Connection connection = basicDataSource.getConnection();
        this.print(connection);
    }
}
