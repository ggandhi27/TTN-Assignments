package Assignment;

public class Tea implements HotDrink{
//    @Override
//    public String toString() {
//        return "Tea";
//    }
    
    @Override
    public void prepareHotDrink() {
        System.out.println("Tea is being prepared.");
    }
}
