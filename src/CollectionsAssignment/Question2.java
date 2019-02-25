//Write a method that takes a string and returns the number of unique characters in the string.

package CollectionsAssignment;


import java.util.HashSet;

public class Question2 {
    public static int uniqueCharacters(String str){
        HashSet<String> hashSet = new HashSet<String>();
        
        for(String x: str.trim().split("")){
            hashSet.add(x);
        }
        
        return hashSet.size();
    }
    
    public static void main(String[] args) {
        System.out.println(uniqueCharacters("gauravgandhi"));
    }
}
