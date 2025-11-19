package Codes;

class InvalidAgeException extends Exception{
    public InvalidAgeException(String s){
        super(s);
    }
}

public class UserDefinedException{
    
    public static void validate(int age) throws InvalidAgeException{
        if(age<18){
            throw new InvalidAgeException("Age must be 18 and above");
        }
        else{
            System.out.println("Valide Age");
        }
    }
    
    public static void main(String[] args) {
        try{
            validate(23);
        }
        catch(InvalidAgeException e){
            System.out.println("Caught in main");
            System.out.println(e.getMessage());
        }
    }
    
}
