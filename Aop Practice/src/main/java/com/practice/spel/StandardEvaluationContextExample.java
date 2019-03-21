package com.practice.spel;

import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

class Employee{
    
    public int age;
    public String name;
    
    @Override
    public String toString() {
        return "Employee{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
    
    public Employee(int age, String name) {
        this.age = age;
        this.name = name;
    }
}

public class StandardEvaluationContextExample {
    public static void main(String[] args) {
        
        Employee employee = new Employee(23,"Gaurav Gandhi");
    
        StandardEvaluationContext evaluationContext = new StandardEvaluationContext(employee);
    
        ExpressionParser expressionParser = new SpelExpressionParser();
    
        Expression expression = expressionParser.parseExpression("name");
    
        System.out.println(expression.getValue(evaluationContext));
        
    }
}
