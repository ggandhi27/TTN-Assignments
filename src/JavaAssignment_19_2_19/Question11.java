package JavaAssignment_19_2_19;

class Bank{
    String branchName;
    String IFSC;
    double rateOfInterest;
    String bankName;
    
    Bank(){
        branchName = "";
        IFSC = "";
        rateOfInterest = 0.0;
        bankName = "";
    }
    
    public void getDetails(){
    
    }
}

class SBI extends Bank{
    SBI(){
    
    }
    SBI(String branchName,String IFSC){
        this.branchName = branchName;
        this.IFSC = IFSC;
        this.rateOfInterest = 5.3;
        this.bankName = "State Bank of India";
    }
    
    public void getDetails(){
        System.out.println("Branch name : "+this.branchName);
        System.out.println("Bank name : "+this.bankName);
        System.out.println("IFSC code : "+this.IFSC);
        System.out.println("Rate of Interest : "+this.rateOfInterest+"%");
    }
}
class BOI extends Bank{
    BOI(){
    
    }
    BOI(String branchName,String IFSC){
        this.branchName = branchName;
        this.IFSC = IFSC;
        this.rateOfInterest = 6.7;
        this.bankName = "Bank Of India";
    }
    
    public void getDetails(){
        System.out.println("Branch name : "+this.branchName);
        System.out.println("Bank name : "+this.bankName);
        System.out.println("IFSC code : "+this.IFSC);
        System.out.println("Rate of Interest : "+this.rateOfInterest+"%");
    }
}


class ICICI extends Bank{
    ICICI(){
    
    }
    ICICI(String branchName,String IFSC){
        this.branchName = branchName;
        this.IFSC = IFSC;
        this.rateOfInterest = 4.7;
        this.bankName = "ICICI";
    }
    
    public void getDetails(){
        System.out.println("Branch name : "+this.branchName);
        System.out.println("Bank name : "+this.bankName);
        System.out.println("IFSC code : "+this.IFSC);
        System.out.println("Rate of Interest : "+this.rateOfInterest+"%");
    }
}

public class Question11 {
    public static void main(String[] args) {
        Bank sbi = new SBI("Sector 18","SBI0005");
        Bank boi = new BOI("Sector 25","BOI2266");
        Bank icici = new ICICI("Sector 126","ICICI3366");
        
        sbi.getDetails();
        System.out.println();
        boi.getDetails();
        System.out.println();
        icici.getDetails();
    }
}
