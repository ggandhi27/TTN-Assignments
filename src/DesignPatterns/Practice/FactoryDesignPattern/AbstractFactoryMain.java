package DesignPatterns.Practice.FactoryDesignPattern;

import java.io.BufferedReader;
import java.io.InputStreamReader;

interface Bank{
    String getBank();
}

class HDFC implements Bank{
    private final String BName;
    
    HDFC(){
        BName = "HDFC";
    }
    
    @Override
    public String getBank() {
        return BName;
    }
}

class ICICI implements Bank{
    
    private final String BName;
    
    ICICI(){
        BName = "ICICI";
    }
    
    @Override
    public String getBank() {
        return BName;
    }
}

class SBI implements Bank{
    
    private final String BName;
    
    SBI(){
        BName = "SBI";
    }
    
    @Override
    public String getBank() {
        return BName;
    }
}

abstract class AbstractFactory{
    abstract Bank getBank(String bankName);
    abstract Loan getLoan(String loanType);
}

class BankFactory extends AbstractFactory{
    Bank getBank(String bankName){
        
        if(bankName == null){
            return null;
        }
        
        if(bankName.equalsIgnoreCase("HDFC")){
            return new HDFC();
        }
        else if(bankName.equalsIgnoreCase("ICICI")){
            return new ICICI();
        }
        else if(bankName.equalsIgnoreCase("SBI")){
            return new SBI();
        }
        else {
            return null;
        }
        
    }
    
    @Override
    Loan getLoan(String loanType) {
        return null;
    }
}

abstract class Loan{
    protected double rate;
    abstract void getInterestRate(double rate);
    public void calculateLoanPayment(double loanamount, int years)
    {
        /*
              to calculate the monthly loan payment i.e. EMI
              
              rate=annual interest rate/12*100;
              n=number of monthly installments;
              1year=12 months.
              so, n=years*12;
 
            */
        
        double EMI;
        int n;
        
        n=years*12;
        rate=rate/1200;
        EMI=((rate*Math.pow((1+rate),n))/((Math.pow((1+rate),n))-1))*loanamount;
        
        System.out.println("your monthly EMI is "+ EMI +" for the amount"+loanamount+" you have borrowed");
    }
}

class HomeLoan extends Loan{
    
    @Override
    void getInterestRate(double rate) {
        this.rate = rate;
    }
}

class BusinessLoan extends Loan{
    
    @Override
    void getInterestRate(double rate) {
        this.rate = rate;
    
    }
}

class EducationLoan extends Loan{
    
    @Override
    void getInterestRate(double rate) {
        this.rate = rate;
        
    }
}

class LoanFactory extends AbstractFactory{
    
    @Override
    Bank getBank(String bankName) {
        return null;
    }
    
    @Override
    Loan getLoan(String loanType){
        
        if(loanType == null){
            return null;
        }
        else if(loanType.equalsIgnoreCase("HomeLoan")){
            return new HomeLoan();
        }
        else if(loanType.equalsIgnoreCase("BusinessLoan")){
            return new BusinessLoan();
        }
        else if(loanType.equalsIgnoreCase("EducationLoan")){
            return new EducationLoan();
        }
        else{
            return null;
        }
    }
    
}


class FactoryCreator{
    AbstractFactory getFactory(String factoryChoice){
        if(factoryChoice == null){
            return null;
        }
        if(factoryChoice.equalsIgnoreCase("Bank")){
            return new BankFactory();
        }
        else if(factoryChoice.equalsIgnoreCase("Loan")){
            return new LoanFactory();
        }
        else {
            return null;
        }
    }
}

public class AbstractFactoryMain {
    public static void main(String[] args) {
        BufferedReader p = new BufferedReader(new InputStreamReader(System.in));
        
    }
}
