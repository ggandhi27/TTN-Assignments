package question3;

import entity.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import question2.UserCrudOperations;

import java.sql.Connection;
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
    }
}
