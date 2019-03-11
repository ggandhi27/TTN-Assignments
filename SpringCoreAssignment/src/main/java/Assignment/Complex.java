package Assignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Complex {
    private List list;
    private Set set;
    private Map map;
    
    @Override
    public String toString() {
        String str = "Complex{";
        str = str + " list = \n";
        for(Object x : list){
            str = str + x + "\n";
        }
        str = str + " set = \n";
        for(Object x : set){
            str = str + x + "\n";
        }
        str = str + " map = \n";
        for(Object x:map.keySet()){
            str = str + x + " : " + map.get(x)+"\n";
        }
        return str;
    }
    
    public Complex(List list, Set set, Map map) {
        this.list = list;
        this.set = set;
        this.map = map;
    }
    
    public List getList() {
        return list;
    }
    
    public void setList(List list) {
        this.list = list;
    }
    
    public Set getSet() {
        return set;
    }
    
    public void setSet(Set set) {
        this.set = set;
    }
    
    public Map getMap() {
        return map;
    }
    
    public void setMap(Map map) {
        this.map = map;
    }
    
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");
        
        Complex complex = (Complex) applicationContext.getBean("complex");
    
        System.out.println(complex);
        
    }
    
}
