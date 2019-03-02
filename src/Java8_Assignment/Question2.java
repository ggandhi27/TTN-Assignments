//Create a functional interface whose method takes 2 integers and return one integer.
package Java8_Assignment;

@FunctionalInterface
interface Question2Interface{
    public int func(int a,int b);
}

public class Question2 {
    public static void main(String[] args) {
        Question2Interface question2Interface = (a, b) -> a*b;
    
        System.out.println(question2Interface.func(5,9));
    }
}
