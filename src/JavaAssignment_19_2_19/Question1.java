/*
Write a program to replace a substring inside a string with other string ?
 */

package JavaAssignment_19_2_19;

public class Question1 {
    public static void main(String args[]){
        String str,str1;
        str = "Narendra Bahubali";
        str1 = "Am";
        str = str.replace("Na",str1);
        System.out.println(str);
    }
}