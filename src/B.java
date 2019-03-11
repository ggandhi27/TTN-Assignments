public class B extends A{
    double func(double a){
        System.out.println("double");
        return  a;
    }
    
    public static void main(String[] args) {
        B a = new B();
//        ((B) a).func(1);
//        ((B) a).func(2l);
        a.func(2);
    }
}

class A{
    int func(int a){
        System.out.println("a");
        return  a;
    }
}