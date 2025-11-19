package Codes;

class DivideByZeroException extends RuntimeException{
    public DivideByZeroException(String s){
        super(s);
    }
}

public class UncheckedCustomException {
    
    public static void divide(int a, int b){
        if (b==0){
            throw new DivideByZeroException("Divide by zero is not allowed");
        }
        System.out.println("Result :" + a/b);
    }
    
    public static void main(String[] args) {
        try{
            divide(5, 0);
        }
        catch (DivideByZeroException e){
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }   
}
