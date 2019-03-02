package JavaAssignment_21_2_19;


class SampleClass implements Cloneable{
    
    private int a;
    private String b;
    
    SampleClass(){
        a = 0;
        b = "";
    }
    
    SampleClass(int a,String b) {
        this.a = a;
        this.b = b;
    }
    
    //Object cloning using copy constructor.
    SampleClass(SampleClass obj){
        this.a = obj.a;
        this.b = obj.b;
    }
    
    public int getA() {
        return a;
    }
    
    public void setA(int a) {
        this.a = a;
    }
    
    public String getB() {
        return b;
    }
    
    public void setB(String b) {
        this.b = b;
    }
    
    
    //Object cloning using cloneable interface
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
public class Question5 {
    public static void main(String[] args) throws CloneNotSupportedException {
        SampleClass obj1 = new SampleClass(5,"five");
        SampleClass obj2 = new SampleClass(obj1);
    
        System.out.println("obj1.a :: "+obj1.getA()+" obj1.b :: "+obj1.getB());
        System.out.println("obj2.a :: "+obj2.getA()+" obj2.b :: "+obj2.getB());
        
        
        SampleClass obj3 = (SampleClass) obj1.clone();
    
    
        System.out.println("obj1.a :: "+obj1.getA()+" obj1.b :: "+obj1.getB());
        System.out.println("obj3.a :: "+obj3.getA()+" obj3.b :: "+obj3.getB());
        System.out.println(obj1.toString());
        System.out.println(obj2.toString());
        System.out.println(obj3.toString());
    }
}
