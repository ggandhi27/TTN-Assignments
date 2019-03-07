package DesignPatterns.Practice.FactoryDesignPattern;

interface Colour{
    String getColour();
}

class Red implements Colour{
    
    @Override
    public String getColour() {
        return "Red";
    }
}

class Blue implements Colour{
    
    @Override
    public String getColour() {
        return "Blue";
    }
}

abstract class Shape{
    Colour colour;
    String shapeType;
    
    Shape(String shapeType,Colour colour){
        this.colour = colour;
        this.shapeType = shapeType;
    }
    
}

class Square extends Shape{
    
    
    Square(Colour colour){
        super("Square",colour);
    }
    
    @Override
    public String toString() {
        return "Square{" +
                "colour=" + colour.getColour() +
                ", shapeType='" + shapeType + '\'' +
                '}';
    }
}

class Triangle extends Shape{
    Triangle(Colour colour){
        super("Triangle",colour);
    
    }
    
    @Override
    public String toString() {
        return "Triangle{" +
                "colour=" + colour.getColour() +
                ", shapeType='" + shapeType + '\'' +
                '}';
    }
}

public class BridgeDesignPattern {
    public static void main(String[] args) {
        Shape square = new Square(new Red());
        System.out.println(square);
    }
}
