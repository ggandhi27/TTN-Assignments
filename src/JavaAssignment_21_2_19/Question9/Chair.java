package JavaAssignment_21_2_19.Question9;

abstract class Chair implements Furniture{
    String chairType;
    Chair()
    {
        System.out.println("\nThis is a chair");
    }
}

class WoodenChair extends Chair {
    
    
    WoodenChair() {
        super();
        chairType = "Wooden";
        System.out.println("This is a " + chairType + " chair");
    }
    
    @Override
    public void fireTest() {
        System.out.println("Wooden chairs have low resistance to fire");
    }
    
    @Override
    public void stressTest() {
        System.out.println("Wooden chairs have moderate resistance to stress");
    }
    
    
    
}
class MetallicChair extends Chair implements Furniture {
    
    
    MetallicChair() {
        chairType = "Metallic";
        System.out.println("This is a " + chairType + " chair");
    }
    
    @Override
    public void fireTest() {
        System.out.println("Metallic chairs have high resistance to fire");
    }
    
    @Override
    public void stressTest() {
        System.out.println("Metallic chairs have high resistance to stress");
    }
}
