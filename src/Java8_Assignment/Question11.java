//Find average of the number inside integer list after doubling it.

package Java8_Assignment;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Question11 {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(12,1,2,3,11,5);
    
        Stream<Integer> integerStream = integerList.stream();
    
        System.out.println(integerStream.collect(Collectors.averagingInt((x)->x*2)));
    }
}
