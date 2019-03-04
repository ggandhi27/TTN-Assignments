package DesignPatterns.Practice.FactoryDesignPattern;

interface Packing{
    String pack();
    int price();
}

abstract class CD implements Packing{
    public abstract String pack();
}

abstract class Company implements Packing{
    public abstract int price();
}

class Sony extends Company{
    
    @Override
    public String pack() {
        return "Sony CD";
    }
    
    @Override
    public int price() {
        return 20;
    }
    
}

class Samsung extends Company{
    
    @Override
    public String pack() {
        return "samsung CD";
    }
    
    @Override
    public int price() {
        return 30;
    }
}
public class BuilderDemo {
}
