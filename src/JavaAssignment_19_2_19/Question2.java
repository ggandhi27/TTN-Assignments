/*
Write a program to find the number of occurrences of the duplicate words in a string and print them ?
 */

package JavaAssignment_19_2_19;

import java.util.HashMap;

public class Question2 {
    public static void main(String[] args) {
        String str = "this is a string . this string is really amazing . all men in this world loves this string .";
        String arr[] = str.split(" ");
        int l;
        l = arr.length;
        int i,j;
        int f = 0;
        int c;
        for(i=0;i<l;i++){
            f=0;
            for(j=i-1;j>=0;j--){
                if(arr[j].equals(arr[i])){
                    f=1;
                    break;
                }
            }
            if(f==0){
                c=1;
                for(j=i+1;j<l;j++){
                    if(arr[j].equals(arr[i])){
                        c++;
                    }
                }
                if(c>1){
                    System.out.println(arr[i]+" : "+c);
                }
            }
        }
    }
}
