package Assignment;

public class ExpressTea implements HotDrink{
    @Override
    public String toString() {
        return "ExpressTea";
    }
    
    @Override
    public void prepareHotDrink() {
        System.out.println("ExpressTea is being prepared.");
    }
}
