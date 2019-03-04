// Implement Decorator pattern to decorate the Pizza with toppings.

package DesignPatterns.Assignment;

interface Toppings{
    void info();
}

class Pizza implements Toppings{
    
    private Toppings toppings;
    
    
    
    Pizza(Toppings toppings){
        this.toppings = toppings;
    }
    Pizza(){
        this.toppings = null;
    }
    @Override
    public void info() {
        System.out.println("Normal Pizza with ");
        if(toppings == null){
            System.out.println("No toppings");
        }
        else{
            toppings.info();
            System.out.println("as toppings");
        }
    }
}

class Onions implements Toppings{
    
    Toppings toppings;
    private  final String type;
    Onions(Toppings toppings ){
        this.toppings = toppings;
        this.type = "Onion";
    }
    Onions(){
        this.type = "Onion";
        this.toppings = null;
    }
    @Override
    public void info() {
        System.out.println(this.type);
        if(toppings != null){
            toppings.info();
        }
    }
}


class Capsicum implements Toppings{
    
    Toppings toppings;
    private  final String type;
    Capsicum(Toppings toppings ){
        this.toppings = toppings;
        this.type = "Capsicum";
    }
    Capsicum(){
        this.type = "Capsicum";
        this.toppings = null;
    }
    @Override
    public void info() {
        System.out.println(this.type);
        if(toppings != null){
            toppings.info();
        }
    }
}

class Corns implements Toppings{
    
    private Toppings toppings;
    private  final String type;
    Corns(Toppings toppings ){
        this.toppings = toppings;
        this.type = "Corns";
    }
    Corns(){
        this.type = "Corns";
        this.toppings = null;
    }
    @Override
    public void info() {
        System.out.println(this.type);
        if(toppings != null){
            toppings.info();
        }
    }
}

public class Question6 {
    public static void main(String[] args) {
        Toppings toppings = new Pizza(new Onions(new Capsicum(new Corns())));
        
        toppings.info();
        
        Toppings normalPizza = new Pizza();
        normalPizza.info();
    }
}

