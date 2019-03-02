package Java8_Assignment;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Question12 {
    public static void main(String[] args) {
    
        List<Integer> integerList = Arrays.asList(1,2,3,6,11,5,12);
    
        Stream<Integer> integerStream = integerList.stream();
    
        System.out.println(integerStream.filter((x)->x%2==0).filter((x)->x>3).findFirst());
    }
}
