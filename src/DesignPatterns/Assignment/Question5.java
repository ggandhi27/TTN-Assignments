// Implement Bridge Design Pattern for Color and Shape such
// that Shape and Color can be combined together
// e.g BlueSquare, RedSquare, PinkTriangle etc.

package DesignPatterns.Assignment;

interface Colour{
    String getColourType();
}

class Red implements Colour{
    @Override
    public String getColourType() {
        return "Red";
    }
}

class Green implements Colour{
    
    @Override
    public String getColourType() {
        return "Green";
    }
}

class Blue implements Colour{
    
    @Override
    public String getColourType() {
        return "Blue";
    }
}
class Pink implements Colour{
    
    @Override
    public String getColourType() {
        return "Pink";
    }
}
abstract class Shape{
    String shapeType;
    Colour colour;
    
    Shape(String shapeType,Colour colour){
        this.shapeType = shapeType;
        this.colour = colour;
    }
}

class Square extends Shape{
    
    Square( Colour colour) {
        super("Square", colour);
    }
    
    @Override
    public String toString() {
        return "Square{" +
                "shapeType='" + shapeType + '\'' +
                ", colour=" + colour.getColourType() +
                '}';
    }
}

class Triangle extends Shape{
    Triangle( Colour colour) {
        super("Triangle", colour);
    }
    
    @Override
    public String toString() {
        return "Triangle{" +
                "shapeType='" + shapeType + '\'' +
                ", colour=" + colour.getColourType() +
                '}';
    }
}

public class Question5 {
    public static void main(String[] args) {
        Square redSquare = new Square(new Red());
        Square blueSquare = new Square(new Blue());
        Triangle pinkTriangle = new Triangle(new Pink());
        Triangle greenTriangle = new Triangle(new Green());
    
        System.out.println(redSquare);
        System.out.println(blueSquare);
        System.out.println(pinkTriangle);
        System.out.println(greenTriangle);
    }
}
