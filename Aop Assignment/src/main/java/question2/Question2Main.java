package question2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Question2Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("question1.xml");
        
        ((ClassPathXmlApplicationContext) applicationContext).start();
        Dummy dummy = (Dummy) applicationContext.getBean("dummy");
        dummy.display();
        ((ClassPathXmlApplicationContext) applicationContext).stop();
        ((ClassPathXmlApplicationContext) applicationContext).close();
    }
}
