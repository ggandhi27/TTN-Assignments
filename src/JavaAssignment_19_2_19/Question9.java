package JavaAssignment_19_2_19;

enum Month{
    
    HOUSE1("Sec49", 50, new Question9());
    String loc;
    int price;
    Question9 q9;
    Month(String loc, int price, Question9 q9) {
        this.loc = loc;
        this.price = price;
        this.q9 = q9;
    }
    
    public int getPrice() {
        return this.price;
    }
}


public class Question9 {
    public static void main(String[] args) {
       for(Month m : Month.values()) {
           System.out.println(m.getPrice());
       }
    }
}
