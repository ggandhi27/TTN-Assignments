package question5;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Question5Aspect {
    
    @Before("pointCut()")
    void beforeLogger(JoinPoint joinPoint){
        System.out.println(joinPoint.getSignature() + " is about to execute");
    }
    
    @After("pointCut()")
    void afterLogger(JoinPoint joinPoint){
        System.out.println(joinPoint.getSignature() + " is completed");
    }
    
    @Pointcut("execution(* question5.Services.*())")
    void pointCut(){}
}
