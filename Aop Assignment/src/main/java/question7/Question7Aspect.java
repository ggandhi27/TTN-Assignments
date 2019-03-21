package question7;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Question7Aspect {
    
    @Pointcut ("execution(* question7.Sample.*(..))")
    void pointcutMethod() {
    }
    
    @After ("pointcutMethod()")
    void afterMethod(JoinPoint joinPoint) {
        System.out.println("Method signature :: " + joinPoint.getSignature());
        
    }
    
    @Before ("pointcutMethod()")
    void beforeMethod(JoinPoint joinPoint) {
        System.out.println("Method args :: "+joinPoint.getArgs());
    }
}
