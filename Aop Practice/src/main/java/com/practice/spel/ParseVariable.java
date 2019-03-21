package com.practice.spel;

import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

public class ParseVariable {
    public static void main(String[] args) {
    
        ExpressionParser expressionParser = new SpelExpressionParser();
    
        StandardEvaluationContext context = new StandardEvaluationContext();
    
        Expression expression = expressionParser.parseExpression("#a + #b * #c");
        
        context.setVariable("a",5);
        context.setVariable("b",9);
        context.setVariable("c",7);
    
        System.out.println(expression.getValue(context));
    }
}
