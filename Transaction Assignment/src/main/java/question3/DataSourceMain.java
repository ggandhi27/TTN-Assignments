package question3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import question2.UserCrudOperations;

import java.sql.Connection;
import java.sql.SQLException;

public class DataSourceMain {
    public static void main(String[] args) throws SQLException {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-data-config.xml");
        
        Question3DaoService question3DaoService = context.getBean(Question3DaoService.class);
        
        Connection connection = question3DaoService.getConnection();
        UserCrudOperations.listUsers(connection);
        
        Connection basicDataSourceConnection = question3DaoService.getBasicDataSourceConnection();
        UserCrudOperations.listUsers(basicDataSourceConnection);
    }
}
