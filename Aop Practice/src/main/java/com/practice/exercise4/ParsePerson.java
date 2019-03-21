package com.practice.exercise4;

import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

public class ParsePerson {
    public static void main(String[] args) {
        Person person = new Person("Gaurav Gandhi",23,"Lucknow");
    
        StandardEvaluationContext context = new StandardEvaluationContext(person);
    
        ExpressionParser expressionParser = new SpelExpressionParser();
    
        Expression expression = expressionParser.parseExpression("city");
    
        System.out.println(expression.getValue(context));
        
        Expression ageExpression = expressionParser.parseExpression("age");
    
        Object object = ageExpression.getValue(context);
    
        Integer integer = (Integer) object;
        System.out.println(integer*5);
        
        System.out.println(ageExpression.getValue(context));
    }
}
