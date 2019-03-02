//Collect all the even numbers from an integer list.
package Java8_Assignment;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Question9 {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1,2,9,2,8,2,9,6,3,1,5);
        Stream<Integer> integerStream = integerList.stream();
        List<Integer> evenList = integerStream.filter((x)-> x%2==0).collect(Collectors.toList());
        
        evenList.forEach((x)-> System.out.println(x));
    }
}
