package JavaAssignment_21_2_19;


class Singleton{
    
    private static Singleton obj;
    
    static{
        obj = null;
    }
    private Singleton(){
    
    }
    
    public static Singleton getObj(){
        if(obj==null) {
            obj = new Singleton();
        }
        return obj;
    }
    
    public void printHello(){
        System.out.println("hello world");
    }
}

public class Question4 {
    public static void main(String[] args) {
        Singleton obj,obj1;
        obj = Singleton.getObj();
        obj1 = Singleton.getObj();
        
        obj.printHello();
        obj1.printHello();
        
        if(obj == obj1){
            System.out.println("Both references points the same object.");
        }
        else {
            System.out.println("Both objects are different objects.");
        }
    }
}
