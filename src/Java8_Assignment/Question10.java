//Sum all the numbers greater than 5 in the integer list.
package Java8_Assignment;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Question10 {
    
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(12,1,2,3,11,5);
        Stream<Integer> integerStream = integerList.stream();
        
        int sum = integerStream.filter((x)->x>5).reduce(0,(a,b) ->a+b);
        System.out.println("Sum  :: "+sum);
    }
}
