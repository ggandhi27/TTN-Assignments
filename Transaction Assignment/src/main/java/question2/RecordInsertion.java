package question2;

import entity.User;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RecordInsertion {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, SQLException {
        
        String driver = "com.mysql.jdbc.driver";
        Class.forName(driver).newInstance();
        
        String url = "jdbc:mysql://localhost:3306/springDemo";
        String username = "gaurav";
        String password = "123456";
    
        Connection connection = getConnectionObject(url,username,password);
        String sql = "INSERT INTO user (username,password,name,age,dob) values (?,?,?,?,?)";
        PreparedStatement preparedStatement = getPreparedStatementObject(connection,sql);
        
        
        
    }
    public static Connection getConnectionObject(String url,String username, String password) throws SQLException {
        return DriverManager.getConnection(url,username,password);
    }
    public static PreparedStatement getPreparedStatementObject(Connection connection, String sqlQuery) throws SQLException {
        return connection.prepareStatement(sqlQuery);
    }
    public static PreparedStatement setUserValues(PreparedStatement preparedStatement, User user) throws SQLException {
        preparedStatement.setString(1,user.getUsername());
        preparedStatement.setString(2,user.getPassword());
        preparedStatement.setString(3,user.getName());
        preparedStatement.setInt(4,user.getAge());
        preparedStatement.setDate(5,user.getDob());
        
        return preparedStatement;
    }
}
