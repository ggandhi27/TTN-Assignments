package com.practice.withoutJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataAccessExample {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, SQLException {
        String driverName = "com.mysql.cj.jdbc.Driver";
        Class.forName(driverName).newInstance();
        String connectionString  = "jdbc:mysql://localhost:3306/springDemo";
        String username = "gaurav";
        String password = "123456";
    
        Connection connection = (Connection) DriverManager.getConnection(connectionString,username,password);
        
        
    }
}
