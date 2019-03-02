interface Multiplier {
    int multiply(int a, int b);
}

public class SamplTest {
    public static void main(String[] args) {
        Multiplier multiplier = new Multiplier() {
            @Override
            public int multiply(int a, int b) {
                return a * b;
            }
        };
        System.out.println(multiplier.multiply(5, 6));
        
        Multiplier multiplier1 = (a, b) -> a * b;
        
        System.out.println(multiplier1.multiply(6, 9));
    }
}
