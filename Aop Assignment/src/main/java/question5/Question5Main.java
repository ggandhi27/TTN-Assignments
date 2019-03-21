package question5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Question5Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("question5.xml");
        
        Services services = applicationContext.getBean(Services.class);
        
        services.method1();
        services.method2();
        services.method3();
        services.method4();
    }
}
