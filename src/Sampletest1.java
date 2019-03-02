@FunctionalInterface
interface Greaterable{
    boolean isGreater(int a,int b);
}

@FunctionalInterface
interface Increase{
    int increment(int a);
}

@FunctionalInterface
interface Concatable{
    String concat(String a,String b);
}

@FunctionalInterface
interface Upperable{
    String toUpperCase(String a);
}

@FunctionalInterface
interface Compute<T,H,G> {
    G compute(T a,H b);
}
public class Sampletest1 {
    public static void main(String[] args) {
    
        Greaterable greaterable = (a, b) -> a>b;
        System.out.println(greaterable.isGreater(5,3));
        
        Increase increase = (a) -> ++a;
        System.out.println(increase.increment(5));
        
        Concatable concatable = (a,b)->a+b;
        System.out.println(concatable.concat("abc","bvujj"));
        
        Upperable upperable = (a)-> a.toUpperCase();
        System.out.println(upperable.toUpperCase("nfnbvi"));
    
        
    }
}
