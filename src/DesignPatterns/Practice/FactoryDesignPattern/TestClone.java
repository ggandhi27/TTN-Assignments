package DesignPatterns.Practice.FactoryDesignPattern;

class Sample implements Cloneable{
    public int a;
    String str;
    Sample(){
        a = 5;
        str=new String("gaurav");
    }
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class TestClone {
    public static void main(String[] args) throws CloneNotSupportedException {
        Sample obj = new Sample();
        System.out.println("Obj(a) :: "+obj.a+" obj ::" + obj.hashCode());
        Sample obj2 = (Sample) obj.clone();
        System.out.println();
        System.out.println("Obj2(a) :: "+obj2.a+" obj2 ::" + obj2.hashCode());
        Sample obj3 = obj;
        obj.a = 6;
        System.out.println("Obj(a) :: "+obj.a+" obj ::" + obj.hashCode());
        System.out.println("Obj2(a) :: "+obj2.a+" obj2 ::" + obj2.hashCode());
        System.out.println("Obj3(a) :: "+obj3.a+" obj3 ::" + obj3.hashCode());
        System.out.println(obj.str == obj2.str);
    }
}
