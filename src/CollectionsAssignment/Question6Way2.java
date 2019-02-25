package CollectionsAssignment;

import java.util.*;

public class Question6Way2 {
    
    public static void main(String[] args) {
        int arr[] = {1,2,4,7,6,5,7,1,4,7,2,2,3,9,4,7,8,2,3,7,8,5,3,4,9,6,3,1,5};
    
        
        Map<Integer,Integer> integerMap = new LinkedHashMap<>();
        
        for(Integer x: arr){
            if(integerMap.containsKey(x)){
                integerMap.put(x,integerMap.get(x)+1);
            }
            else{
                integerMap.put(x,1);
            }
        }
    
        List<Map.Entry<Integer,Integer>> entryList = new LinkedList<>(integerMap.entrySet());
    
    
        Collections.sort(entryList, new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o1.getValue() - o2.getValue();
            }
        });
    
        entryList.forEach((n)->{
            System.out.println(n.getKey()+" ---> "+n.getValue());
        });
    }
    
}
