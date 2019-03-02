// Create and access default and static method of an interface.

package Java8_Assignment;

interface SampleInterface{
    default void defaultMehtod() {
        System.out.println("Default method invoked");
    }
    
    static  void staticMethod(){
        System.out.println("Static method invoked.");
    }
}


public class Question6 implements  SampleInterface{
    public static void main(String[] args) {
        Question6 question6 = new Question6();
        question6.defaultMehtod();
        SampleInterface.staticMethod();
    }
}
