// Implement Factory Pattern to get the Polygon of different type.

package DesignPatterns.Assignment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

interface Polygon{
    void getShape();
}

class Quadrilateral implements Polygon{
    
    @Override
    public void getShape() {
        System.out.println("Quadrilateral served.");
    
    }
}

class Pentagon implements Polygon{
    
    @Override
    public void getShape() {
        System.out.println("Pentagon served.");
    }
}

class Hexagon implements Polygon{
    
    @Override
    public void getShape() {
        System.out.println("Hexagon served.");
    }
}

class PolygonFactory{
    Polygon getPolygonInstance(String polygon){
        
        switch (polygon){
            case "Quadrilateral":{
                return new Quadrilateral();
            }
            case "Pentagon ":{
                return new Pentagon();
            }
            case "Hexagon":{
                return new Hexagon();
            }
        }
        return null;
    }
}

public class Question2 {
    public static void main(String[] args) throws IOException {
        PolygonFactory polygonFactory = new PolygonFactory();
        BufferedReader p = new BufferedReader(new InputStreamReader(System.in));
        String choice;
        System.out.println("Quadrilateral, Hexagon or Pentagon ?\nPlease enter your choice :: ");
        choice = p.readLine();
        Polygon polygon = polygonFactory.getPolygonInstance(choice);
        
        if(polygon == null){
            System.out.println("Please enter a correct choice.");
        }
        else{
            polygon.getShape();
        }
    }
}
