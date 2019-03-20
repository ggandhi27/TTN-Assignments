package com.practice.spel;

import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class HelloWorld {
    public static void main(String[] args) {
    
        ExpressionParser expressionParser = new SpelExpressionParser();
        Expression expression = expressionParser.parseExpression("'Hello world'");
        
        String message = (String) expression.getValue();
        System.out.println(message);
        
        Expression expression1 = expressionParser.parseExpression("{1,2,3,4}");
        System.out.println(expression1.getValue());
    }
}
