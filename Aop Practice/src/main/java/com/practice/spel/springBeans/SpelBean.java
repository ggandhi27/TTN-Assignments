package com.practice.spel.springBeans;

import org.springframework.beans.factory.annotation.Value;

import java.util.List;
import java.util.Map;

public class SpelBean {
    
    @Value("#{'Gaurav'}")
    String name;
    
    @Value("#{23}")
    Integer age;
    
    @Value("#{1,2,3,4}")
    List list;
    
    @Override
    public String toString() {
        return "SpelBean{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", list=" + list +
                ", map=" + map +
                '}';
    }
    
    @Value("#{gaurav :'gandhi',akshay : 'kharbanda'}")
    Map map;
    public String getName() {
        return name;
    }
    
    public Integer getAge() {
        return age;
    }
    
    public List getList() {
        return list;
    }
    
    public Map getMap() {
        return map;
    }
    
}
