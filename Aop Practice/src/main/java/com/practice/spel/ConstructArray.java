package com.practice.spel;

import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class ConstructArray {
    public static void main(String[] args) {
        ExpressionParser expressionParser = new SpelExpressionParser();
    
        Expression expression = expressionParser.parseExpression("new int[]{1,2,3,4}");
        
        int arr[] = (int[]) expression.getValue();
    
        System.out.println(arr);
        
        for(int x:arr){
            System.out.println(x);
        }
    }
}
