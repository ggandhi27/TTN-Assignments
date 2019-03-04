package DesignPatterns.Assignment;

class Singleton{
    
    private static Singleton obj = null;
    
    private Singleton(){
    
    }
    
    static Singleton getObj(){
        if(obj == null){
            synchronized (Singleton.class){
                if(obj == null){
                    obj = new Singleton();
                }
            }
        }
        return obj;
    }
}
public class Question1 {
    public static void main(String[] args) {
        Singleton singleton;
        
        singleton = Singleton.getObj();
    }
}
