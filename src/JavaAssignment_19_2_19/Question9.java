package JavaAssignment_19_2_19;

enum Month{
    
    JANUARY,FEBRUARY,MARCH,APRIL,MAY,JUNE,JULY,AUGUST,SEPTEMBER,OCTOBER,NOVEMBER,DECEMBER;
    
}

class House{
    
    int price;
    String location;
    String city;
    Month month;
    
    House(){
        price = 0;
        location = "";
        city = "";
    }
    
    House(int price,String location,String city,Month month){
        this.price = price;
        this.location = location;
        this.city = city;
        this.month = month;
    }
    
    public void getPrice(){
        System.out.println("Location : "+this.location);
        System.out.println("City : "+this.city);
        System.out.println("Price : "+this.price);
        System.out.println("Month : "+this.month.name());
    }
}

public class Question9 {
    public static void main(String[] args) {
        House house = new House(3600000,"Sector 49","Noida",Month.FEBRUARY);
        house.getPrice();
    }
}
