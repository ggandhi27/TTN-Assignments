package Assignment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class Restaurant {
    HotDrink hotDrink;
    
//    @Override
//    public String toString() {
//        return "Restaurant{" +
//                "hotDrink=" + hotDrink +
//                '}';
//    }
    
    public HotDrink getHotDrink() {
        return hotDrink;
    }
    
    @Required
    @Autowired
    public void setHotDrink(HotDrink hotDrink) {
        this.hotDrink = hotDrink;
    }
    
    public Restaurant(HotDrink hotDrink) {
        this.hotDrink = hotDrink;
    }
    
    public Restaurant() {
    }
    
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");
        
        Restaurant teaRestaurant1 = (Restaurant) applicationContext.getBean("teaRestaurant");
        Restaurant teaResTaurant2 = (Restaurant) applicationContext.getBean("teaRestaurant");
        
        if(teaRestaurant1 == teaResTaurant2){
            System.out.println("Prototype fails");
        }
        else {
            System.out.println("Prototype successful.");
        }
//        System.out.println(restaurant);
        
//        Restaurant restaurant1 = (Restaurant) applicationContext.getBean("expressTeaRestaurant");
    
//        System.out.println(restaurant1);
        
        Restaurant restaurant2 = (Restaurant) applicationContext.getBean("autowireByName");
        Restaurant restaurant3 = (Restaurant) applicationContext.getBean("autowireByType");
        Restaurant restaurant4 = (Restaurant) applicationContext.getBean("autowireByConstructor");
    
        System.out.println(restaurant2);
        System.out.println(restaurant3);
        System.out.println(restaurant4);
        
        System.out.println(restaurant2.getHotDrink());
        System.out.println(restaurant3.getHotDrink());
        System.out.println(restaurant4.getHotDrink());
        
    
    }
}
