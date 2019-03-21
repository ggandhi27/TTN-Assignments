package question4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Question4Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("question4.xml");
        
        Services services = (Services)applicationContext.getBean("services");
        
        services.method1();
        services.method2();
        services.method3();
        services.method4();
    }
}
