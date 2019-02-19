/*
Calculate the number & Percentage Of Lowercase Letters,Uppercase Letters, Digits And Other Special Characters In A String
 */

package JavaAssignment_19_2_19;

public class Question4 {
    public static void main(String[] args) {
        String str = "This is a string for testing. What about writing some digits like 1 5 3 9. Can you feel it?";
        
        int lower,upper,digits,characters;
        lower = upper = digits = characters = 0;
        int i;
        for(i=0;i<str.length();i++){
            
            char c;
            c = str.charAt(i);
            
            if((c>='a')&&(c<='z')){
                lower++;
            }
            else if((c>='A')&&(c<='Z')){
                upper++;
            }
            else if((c>='0')&&(c<='9')){
                digits++;
            }
            else{
                characters++;
            }
        }
        
        System.out.println("Lower Case Count = "+lower+"\nLower Case Percentage = "+(((float)lower/(float) str.length())*100));
        System.out.println("Upper Case Count = "+upper+"\nUpper Case Percentage = "+(((float)upper/(float) str.length())*100));
        System.out.println("Digits Count = "+digits+"\nDigits Percentage = "+(((float)digits/(float) str.length())*100));
        System.out.println("Characters Count = "+characters+"\nCharacters Percentage = "+(((float)characters/(float) str.length())*100));
        
    }
}
