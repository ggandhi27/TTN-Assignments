package com.practice.withoutJDBC;

import java.sql.*;

public class DataAccessExample {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, SQLException {
        String driverName = "com.mysql.cj.jdbc.Driver";
        Class.forName(driverName).newInstance();
        String connectionString = "jdbc:mysql://localhost:3306/springDemo";
        String username = "gaurav";
        String password = "123456";
        
        Connection connection = (Connection) DriverManager.getConnection(connectionString, username, password);
        
        PreparedStatement preparedStatement = connection.prepareStatement("select * from user");
        
        ResultSet resultSet = preparedStatement.executeQuery();
        
        while (resultSet.next()) {
            System.out.println(resultSet.getString("username" ));
        }
    }
}
