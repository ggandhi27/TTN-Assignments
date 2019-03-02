//Override the default method of the interface.

package Java8_Assignment;

public class Question7 implements SampleInterface{
    
    @Override
    public void defaultMehtod() {
        System.out.println("Default method is overridden");
    }
    
    public static void main(String[] args) {
        Question7 question7 = new Question7();
        question7.defaultMehtod();
    }
}
