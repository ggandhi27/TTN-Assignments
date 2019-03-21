package question7;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Question7Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("question7.xml");
        Sample sample = applicationContext.getBean(Sample.class);
        
        sample.method1(5);
        sample.method2(7,8);
        sample.method3();
    }
}
