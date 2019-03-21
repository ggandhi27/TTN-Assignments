package question4;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Question4Aspect {

    @Pointcut("execution(* question4.Services.*())")
    void logPointcut(){}
    
    @Before("logPointcut()")
    void logger(JoinPoint joinPoint){
        System.out.println(joinPoint.getSignature());
        System.out.println(joinPoint.getSourceLocation());
    }

}
