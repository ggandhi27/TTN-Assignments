package question3;

import entity.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import question2.UserCrudOperations;

import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;

public class DataSourceMain {
    public static void main(String[] args) throws SQLException {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-data-config.xml");
        
        Question3DaoService question3DaoService = context.getBean(Question3DaoService.class);
        
        System.out.println("Using DriverManagerDataSource class\n******************************************************");
        Connection connection = question3DaoService.getConnection();
        UserCrudOperations.listUsers(connection);
    
        System.out.println("Using BasicDataSource class\n******************************************************");
        Connection basicDataSourceConnection = question3DaoService.getBasicDataSourceConnection();
        UserCrudOperations.listUsers(basicDataSourceConnection);
    
        System.out.println("Using SingleConnectionDataSource class\n******************************************************");
        Connection singleConnectionDataSourceConnection = question3DaoService.getSingleConnectionDataSource();
        UserCrudOperations.listUsers(singleConnectionDataSourceConnection);
    
        System.out.print("Number of users in the user table are :: ");
        question3DaoService.printUserCount();
        
        String username = "cgandhi";
        System.out.println("Name associated with the username : " +username+" " +
                "is "+question3DaoService.getName(username));
    
    
        User user1 = new User("ggandhi1","123456","gaurav",23,new Date(96,7,27));
        question3DaoService.insertUser(user1);
        
        UserCrudOperations.listUsers(connection);
    }
}
