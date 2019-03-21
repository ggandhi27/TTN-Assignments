package question6;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Question6Aspect {
    
    @AfterThrowing("pointCutMethod()")
    void logExceptionMethod(JoinPoint joinPoint){
        System.out.println(joinPoint.getSignature() + "throws an Exception");
    }
    
    @Pointcut("execution(* question6.Sample.*())")
    void pointCutMethod(){}
    
}
