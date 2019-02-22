package JavaAssignment_21_2_19;


class CustomException extends Exception{
    
    
    CustomException(){
    
    }
    
    @Override
    public synchronized Throwable fillInStackTrace() {
        return this;
    }
}

public class Question13 {
    public static void main(String[] args) throws CustomException {
       
        throw new CustomException();
    }
}
