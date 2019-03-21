package question3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CustomMain{
    public static void main(String[] args) {
    
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("question3.xml");
    
        Database database = applicationContext.getBean(Database.class);
        
        database.connect();
    }
}
