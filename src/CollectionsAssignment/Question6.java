// Print the elements of an array in the decreasing frequency if 2
// numbers have same frequency then print the one which came first.

package CollectionsAssignment;

import java.util.HashMap;

public class Question6 {
    public static void main(String[] args) {
        int arr[] = {1,3,4,3,1,5,6,7,8,3,1,3,4,8,9,0};
        
        int j,i;
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for(i=0;i<arr.length;i++){
            if(hashMap.containsKey(arr[i])){
                hashMap.put(arr[i],hashMap.get(arr[i])+1);
            }
            else
            {
                hashMap.put(arr[i],1);
            }
        }
        Object[] keys = hashMap.keySet().toArray();
        
        for(i=0;i<keys.length;i++){
            for(j=i+1;j<keys.length;j++){
                if(hashMap.get((Integer) keys[i])>hashMap.get((Integer) keys[j])){
                    Object k;
                    k = keys[i];
                    keys[i] = keys[j];
                    keys[j] = k;
                }
            }
        }
        
        for(Object x:keys){
            System.out.println((Integer)x);
        }
    }
}
