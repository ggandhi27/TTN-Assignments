package JavaAssignment_19_2_19;

public class Question10 {
    
    public static int add(int a,int b){
        return a+b;
    }
    
    public static double add(double a,double b){
        return a+b;
    }
    public static int multiply(int a,int b){
        return a*b;
    }
    public static float multiply(float a,float b){
        return a*b;
    }
    public static String concat(String a,String b){
        return a+b;
    }
    
    public static String concat(String a,String b,String c){
        return a+b+c;
    }
    public static void main(String[] args) {
        System.out.println("Integer addition : "+add(25,30));
        System.out.println("Double  addition : "+add(25.10,30.6));
        System.out.println("Integer multiplication : "+multiply(3,9));
        System.out.println("Float multiplication : "+multiply(3.6F,4.7F));
        System.out.println("To + TheNew : "+concat("To","TheNew"));
        System.out.println("To + The + New : "+concat("To","The","New"));
    }
}
