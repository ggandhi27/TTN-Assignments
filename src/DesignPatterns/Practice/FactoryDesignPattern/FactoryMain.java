package DesignPatterns.Practice.FactoryDesignPattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

interface Plan{
    int getRate();
}

class DomesticPlan implements Plan{
    
    @Override
    public int getRate() {
        return 7;
    }
    
}

class CommercialPlan implements Plan{
    
    @Override
    public int getRate() {
        return 10;
    }
}

class InstitutionalPlan implements Plan{
    
    @Override
    public int getRate() {
        return 5;
    }
}

class GetPlanFactory{
    Plan getPlanObject(String str){
        
        switch (str){
            case "Domestic":{
                return new DomesticPlan();
            }
            case "Commercial":{
                return new CommercialPlan();
            }
            case "Institutional":{
                return new InstitutionalPlan();
            }
        }
        
        return null;
    }
}

public class FactoryMain {
    public static void main(String[] args) throws IOException {
        BufferedReader p = new BufferedReader(new InputStreamReader(System.in));
        
        String choice;
        System.out.println("Commercial, Domestic or Institutional ?");
        System.out.println("Enter your choice of plan ::");
        choice = p.readLine();
        GetPlanFactory getPlanFactory = new GetPlanFactory();
        Plan plan = getPlanFactory.getPlanObject(choice);
        if(plan == null){
            System.out.println("Enter the correct spelling :P");
        }
        else{
            System.out.println("Rate for the selected plan is " + plan.getRate());
        }
    }
}
