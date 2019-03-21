package com.practice.spel;

import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class InlineList {
    public static void main(String[] args) {
        ExpressionParser expressionParser = new SpelExpressionParser();
    
        Expression expression = expressionParser.parseExpression("{1,2,3,3,4}");
    
        System.out.println(expression.getValue());
    }
}
