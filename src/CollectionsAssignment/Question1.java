//Write Java code to define List . Insert 5 floating point numbers in List, and using an iterator, find the sum of the numbers in List.

package CollectionsAssignment;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Question1 {
    public static void main(String[] args) {
        List<Float> floatList = new ArrayList<Float>();
        
        floatList.add(10.5F);
        floatList.add(11.26F);
        floatList.add(14.34F);
        floatList.add(13.52F);
        floatList.add(11.36F);
        
        Float sum = new Float(0.0);
    
        Iterator iterator = floatList.iterator();
        
        while(iterator.hasNext()){
            sum = sum + (Float) iterator.next();
        }
    
        System.out.println("Sum :: "+sum);
    }
}
