package question6;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class Question6Main {
    public static void main(String[] args) throws IOException {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("question6.xml");
        
        Sample sample = applicationContext.getBean(Sample.class);
        try {
            sample.method2();
        }
        catch (Exception e){
        
        }
        try {
            sample.method3();
        }
        catch (Exception e){
        
        }
        try {
            sample.method4();
        }
        catch (Exception e){
        
        }
        try {
            sample.method5();
        }
        catch (Exception e){
        
        }
        try {
            sample.method1();
        }
        catch (Exception e){
        
        }
        
    }
}
