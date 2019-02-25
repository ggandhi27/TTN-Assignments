//Write a method that takes a string and print the number of occurrence of each character characters in the string.

package CollectionsAssignment;

import java.util.HashMap;

public class Question3 {
    public static void printCharacterCount(String str){
        HashMap<Character,Integer> hashMap = new HashMap<>();
        
        int i;
        for(i=0;i<str.length();i++){
            
            char c = str.charAt(i);
            
            if(hashMap.containsKey(c)){
                hashMap.put(c,hashMap.get(c)+1);
            }
            else{
                hashMap.put(c,1);
            }
        }
        for(Character c : hashMap.keySet()){
            System.out.println(c + " :: "+hashMap.get(c));
        }
    }
    
    public static void main(String[] args) {
        printCharacterCount("This is a sample string to test the validity of the method.");
    }
}
