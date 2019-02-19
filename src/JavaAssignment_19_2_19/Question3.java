
//Write a program to find the number of occurrences of a character in a string without using loop?

package JavaAssignment_19_2_19;

public class Question3 {
    public static void main(String[] args) {
        String str = "This is a string.";
        String a = "i";
        System.out.println("Length : "+str.length());
        System.out.println("Count of i in str is : "+(str.length() - str.replaceAll(a,"").length()));
    }
}
