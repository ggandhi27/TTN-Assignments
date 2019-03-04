//Implement Abstract Factory Pattern to create cars of different categories from different countries.
package DesignPatterns.Assignment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

interface Cars{
    String getCarName();
}

class Honda implements Cars{
    private final String carName;
    
    Honda(){
        carName = "Honda";
    }
    @Override
    public String getCarName() {
        return carName;
    }
}

class BMW implements Cars{
    
    private final String carName;
    
    BMW() {
        carName = "BMW";
    }
    @Override
    public String getCarName() {
        return carName;
    }
}

class Audi implements Cars{
    private final String carName;
    
    Audi() {
        carName = "Audi";
    }
    
    @Override
    public String getCarName() {
        return carName;
    }
}

interface Country{
    String getCountryName();
}

class Germany implements Country{
    
    private final String countryName;
    
    Germany() {
        countryName = "Germany";
    }
    
    
    @Override
    public String getCountryName() {
        return countryName;
    }
}
class Italy implements Country{
    
    private final String countryName;
    
    Italy() {
        countryName = "Italy";
    }
    
    
    @Override
    public String getCountryName() {
        return countryName;
    }
}
class France implements Country{
    
    private final String countryName;
    
    France() {
        countryName = "France";
    }
    
    
    @Override
    public String getCountryName() {
        return countryName;
    }
}

abstract class AbstractFactory{
    abstract Cars getCars(String carName);
    abstract Country getCountry(String countryName);
}

class CarFactory extends AbstractFactory{
    
    @Override
    Cars getCars(String carName) {
        
        if (carName == null){
            return null;
        }
        
        if (carName.equalsIgnoreCase("Honda")){
            return new Honda();
        }
        else if (carName.equalsIgnoreCase("BMW")){
            return new BMW();
        }
        else if (carName.equalsIgnoreCase("Audi")){
            return new Audi();
        }
        else {
            return null;
        }
    }
    
    @Override
    Country getCountry(String countryName) {
        return null;
    }
}

class CountryFactory extends AbstractFactory{
    
    @Override
    Cars getCars(String carName) {
        return null;
    }
    
    @Override
    Country getCountry(String countryName) {
        if(countryName == null){
            return null;
        }
        else if(countryName.equalsIgnoreCase("Germany")){
            return new Germany();
        }
        else if(countryName.equalsIgnoreCase("Italy")){
            return new Italy();
        }
        else if(countryName.equalsIgnoreCase("France")){
            return new France();
        }
        else {
            return null;
        }
    }
}

class CreateFactory{
    AbstractFactory getFactory(String choice){
        if(choice == null){
            return null;
        }
        if(choice.equalsIgnoreCase("Cars")){
            return new CarFactory();
        }
        else if(choice.equalsIgnoreCase("Country")){
            return new CountryFactory();
        }
        else {
            return null;
        }
    }
}

public class Question3 {
    public static void main(String[] args) throws IOException {
        CreateFactory createFactory = new CreateFactory();
        AbstractFactory carsFactory = createFactory.getFactory("cars");
        AbstractFactory countryFactory = createFactory.getFactory("country");
        BufferedReader p = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Honda, BMW, Audi.\nEnter your choice of car :: ");
        String carChoice = p.readLine();
        Cars cars = carsFactory.getCars(carChoice);
        System.out.println("Germany, Italy, France.\nEnter your choice of Country ::");
        String countryChoice = p.readLine();
        Country country = countryFactory.getCountry(countryChoice);
    
        System.out.println("Your car is "+cars.getCarName()+" from "+country.getCountryName());
    }
}
