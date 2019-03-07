package DesignPatterns.Practice.FactoryDesignPattern;

import java.util.Arrays;

enum Days{
    MONDAY(1),TUESDAY(4),WEDNESDAY(5);
    
    private final int i;
    
    Days(int i) {
        this.i = i;
    }
    int getValue(){
        return i;
    }
}

public class TestEnum {
    public static void main(String[] args) {
        for(Days d:Days.values()){
            System.out.println(d.ordinal());
        }
    }
}
