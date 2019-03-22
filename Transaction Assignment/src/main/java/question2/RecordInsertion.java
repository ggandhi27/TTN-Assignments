package question2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RecordInsertion {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, SQLException {
        
        String sql = "com.mysql.jdbc.driver";
        Class.forName(sql).newInstance();
        
        String url = "jdbc:mysql://localhost:3306/springDemo";
        String username = "gaurav";
        String password = "123456";
    
        Connection connection = DriverManager.getConnection(url,username,password);
        PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO user (username,password,name,age,dob) VALUES ");
    }
}
