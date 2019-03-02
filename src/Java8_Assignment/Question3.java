// Using (instance) Method reference create and apply add and subtract method
// and using (Static) Method reference create and apply multiplication method
// for the functional interface created.

package Java8_Assignment;

class AddClass{
    public int add(int a,int b){
        return a+b;
    }
}

@FunctionalInterface
interface AddInterface{
    public int add(int a,int b);
}
class SubtractClass{
    public int subtract(int a,int b){
        return a-b;
    }
}

@FunctionalInterface
interface SubtractInterface{
    public int subtract(int a,int b);
}

class MultiplyClass{
    public static int multiply(int a,int b){
        return a*b;
    }
}

@FunctionalInterface
interface MultiplyInterface{
    public  int multiply(int a,int b);
}

public class Question3 {
    public static void main(String[] args) {
        AddInterface addInterface = (new AddClass())::add;
        System.out.println("Add : "+addInterface.add(5,3));
        
        SubtractInterface subtractInterface = (new SubtractClass())::subtract;
        System.out.println("Subtract : "+subtractInterface.subtract(5,3));
        
        MultiplyInterface multiplyInterface = MultiplyClass::multiply;
        System.out.println("Multiply : "+multiplyInterface.multiply(5,3));
    }
}