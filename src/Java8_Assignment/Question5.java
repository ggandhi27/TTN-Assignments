/*


Implement following functional interfaces from java.util.function using lambdas:

    (1) Consumer

    (2) Supplier

    (3) Predicate

    (4) Function


 */

package Java8_Assignment;

import org.w3c.dom.ranges.Range;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Question5 {
    
    public static void main(String[] args) {
        Function<Integer,Integer> func = (a) -> a*a;
        System.out.println("Function :: "+func.apply(5));
    
        Supplier<List<Integer>> listSupplier = ()->{
            List<Integer> integerList = Arrays.asList(1,2,6);
           return integerList;
        };
        System.out.println("Supplied list is :: "+listSupplier.get());
    
        Consumer<List<Integer>> listConsumer = (a)->{
            System.out.println("The consumed list is :: ");
            a.forEach((x)-> System.out.println(x));
        };
        
        listConsumer.accept(Arrays.asList(1,32,9,5,9,2,7,9,6,6));
    
        Predicate<Integer> integerPredicate = (a)-> a>10;
    
        System.out.println("Predicate result :: "+integerPredicate.test(6));
    }
}
