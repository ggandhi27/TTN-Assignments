package com.practice.spel;

import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class InlineMap {
    public static void main(String[] args) {
        ExpressionParser expressionParser = new SpelExpressionParser();
        Expression expression = expressionParser.parseExpression("{gaurav:1,gandhi:'cool'}");
    
        System.out.println(expression.getValue());
    }
}
