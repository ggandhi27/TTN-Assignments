package JavaAssignment_21_2_19.Question9;

abstract class Table {
    Table() {
        System.out.println("\nThis is a table");
    }
}




class WoodenTable extends Table implements Furniture{
    String tableType="Wooden";
    
    
    WoodenTable() {
        super();
        System.out.println("This is a " + tableType + " table");
    }
    
    @Override
    public void fireTest() {
        System.out.println("Wooden table have low resistance to fire");
    }
    
    @Override
    public void stressTest() {
        System.out.println("Wooden table have moderate resistance to stress");
    }
    
    
    
}



class MetallicTable extends Table implements Furniture {
    String tableType="Metallic";
    
    
    MetallicTable() {
        System.out.println("This is a " + tableType + " table");
    }
    
    @Override
    public void fireTest() {
        System.out.println("Metallic tables have high resistance to fire");
    }
    
    @Override
    public void stressTest() {
        System.out.println("Metallic tables have high resistance to stress");
    }}
