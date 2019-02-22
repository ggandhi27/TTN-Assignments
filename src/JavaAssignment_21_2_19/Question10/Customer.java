package JavaAssignment_21_2_19.Question10;

import java.util.UUID;

public class Customer extends Person {
    UUID id;
    
    Customer(String name, int age, Long contact) {
        super(name, age, contact);
    }
    
    public void setId(UUID id) {
        this.id = id;
    }
    
    void orders() {
        System.out.println(getName() + " places an order.");
    }
    
    void waits() {
        System.out.println(getName() + " waits for the order.");
    }
    
    void collectsOrder() {
        System.out.println(getName() + " collects the coffee and enjoys the drink.");
    }
}
