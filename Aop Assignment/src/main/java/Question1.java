import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Question1 {
    public static void main(String[] args) {
    
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("question1.xml");
        ((ClassPathXmlApplicationContext) applicationContext).start();
        ((ClassPathXmlApplicationContext) applicationContext).stop();
        ((ClassPathXmlApplicationContext) applicationContext).close();
    }
}