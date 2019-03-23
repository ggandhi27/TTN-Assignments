package question2;

import entity.User;

import java.sql.*;

public class UserCrudOperations {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, SQLException {
        
        String driver = "com.mysql.cj.jdbc.Driver";
        Class.forName(driver).newInstance();
        
        String url = "jdbc:mysql://localhost:3306/springDemo";
        String username = "gaurav";
        String password = "123456";
    
        Connection connection = getConnectionObject(url,username,password);
        
        User user1 = new User("ggandhi","123456","gaurav",23,new Date(96,7,27));
        insertUser(connection,user1);
        
        User user2 = new User("cgandhi","255888","chirag",20,new Date(99,3,23));
        insertUser(connection,user2);
        
        listUsers(connection);
    
        deleteUser(connection,user1);
        
        user2.setAge(95);
        
        updateUser(connection,user2);
        
        listUsers(connection);
    }
    
    private static void updateUser(Connection connection, User user1) throws SQLException {
        String updateQuery = "UPDATE user SET password=?,name=?,age=?,dob=? WHERE username=?" ;
        PreparedStatement preparedStatement = connection.prepareStatement(updateQuery);
        preparedStatement.setString(1,user1.getPassword());
        preparedStatement.setString(2,user1.getName());
        preparedStatement.setString(5,user1.getUsername());
        preparedStatement.setInt(3,user1.getAge());
        preparedStatement.setDate(4,user1.getDob());
        
        if(!preparedStatement.execute()) {
            System.out.println("User is updated successfully");
        }
        else {
            System.out.println("Error occurred while updating the user.");
        }
    }
    
    public static Connection getConnectionObject(String url,String username, String password) throws SQLException {
        return DriverManager.getConnection(url,username,password);
    }
    public static PreparedStatement getPreparedStatementObject(Connection connection, String sqlQuery) throws SQLException {
        return connection.prepareStatement(sqlQuery);
    }
    public static PreparedStatement setUserValues(Connection connection, User user) throws SQLException {
        String sql = "INSERT INTO user (username,password,name,age,dob) values (?,?,?,?,?)";
        PreparedStatement preparedStatement = getPreparedStatementObject(connection,sql);
        
        return preparedStatement;
    }
    
    public static void insertUser(Connection connection,User user) throws SQLException {
    
        PreparedStatement preparedStatement = setUserValues(connection,user);
        preparedStatement.setString(1,user.getUsername());
        preparedStatement.setString(2,user.getPassword());
        preparedStatement.setString(3,user.getName());
        preparedStatement.setInt(4,user.getAge());
        preparedStatement.setDate(5,user.getDob());
        if(!preparedStatement.execute()) {
            System.out.println("Query executed successfully");
        }
        else {
            System.out.println("Error occurred while executing query.");
        }
    }
    public static void listUsers(Connection connection) throws SQLException {
        String selectQuery = "SELECT * FROM user";
        PreparedStatement preparedStatement = connection.prepareStatement(selectQuery);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            System.out.println("Username :: " + resultSet.getString(1));
            System.out.println("Password :: " + resultSet.getString(2));
            System.out.println("Name :: " + resultSet.getString(3));
            System.out.println("Age :: " + resultSet.getInt(4));
            System.out.println("Date of Birth :: " + resultSet.getDate(5));
            System.out.println("******************************************************");
        }
    }
    
    public static void deleteUser(Connection connection,User user) throws SQLException {
        String deleteQuery = "DELETE FROM user WHERE username=?";
        PreparedStatement preparedStatement = connection.prepareStatement(deleteQuery);
        preparedStatement.setString(1,user.getUsername());
        
        if(!preparedStatement.execute()) {
            System.out.println("User deleted successfully");
        }
        else {
            System.out.println("Error occurred while deleting the user.");
        }
    }
}
