package Assignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

// Question 1 : Create a class Database with 2 instance variables port and name.
// Configure Database class bean in spring container through Spring XML.
// Initialize instance variables using setter method.

public class Database {
    private int port;
    private String name;
    
    public Database() {
    }
    
    @Override
    public String toString() {
        return "Database{" +
                "port=" + port +
                ", name='" + name + '\'' +
                '}';
    }
    
    public int getPort() {
        return port;
    }
    
    public void setPort(int port) {
        this.port = port;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public Database(int port, String name) {
        this.port = port;
        this.name = name;
    }
    
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");
        Database database = (Database) applicationContext.getBean("setter-config");
        System.out.println(database);
        Database database1 = (Database) applicationContext.getBean("constructor-config");
        System.out.println(database1);
    }
}
