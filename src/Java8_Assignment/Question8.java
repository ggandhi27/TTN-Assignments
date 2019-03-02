//Implement multiple inheritance with default method inside  interface.
        
package Java8_Assignment;

interface ParentInterface{
    default void display(){
        System.out.println("Inside Parent Interface");
    }
}

interface Child1Interface extends ParentInterface{
    @Override
    default void display() {
        System.out.println("Inside child 1");
    }
}

interface Child2Interface extends ParentInterface{
    @Override
    default void display() {
        System.out.println("Inside child 2");
    }
}



public class Question8 implements Child1Interface,Child2Interface{
    
    @Override
    public void display() {
        System.out.println("Display method overridden");
        Child2Interface.super.display();
        Child1Interface.super.display();
    }
    
    public static void main(String[] args) {
        Question8 question8 = new Question8();
        
        question8.display();
    }
}
