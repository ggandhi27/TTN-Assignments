package com.practice.spel;

import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class RelationalLogicalMathematical {
    
    public static void main(String[] args) {
    
        ExpressionParser expressionParser = new SpelExpressionParser();
        
        System.out.println("Relational operatrion :: ");
    
        Expression rexpression  = expressionParser.parseExpression("3>5");
    
        System.out.println("3>5 :: "+rexpression.getValue());
    
        System.out.println("Logical operation :: ");
    
        System.out.println(expressionParser.parseExpression("true and false").getValue());
    
        System.out.println("Mathematical operation :: ");
    
        System.out.println(expressionParser.parseExpression("3*5+9-8").getValue());
    }
}
