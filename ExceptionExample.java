package Codes;

public class ExceptionExample {
    static void fun(){
        try{
            throw new NullPointerException("Demo");   
        }
        catch (NullPointerException e){

            System.out.println("Caught inside fun()");
            throw e;
        }
        /*
         * Caught inside fun()
            Caught in main
         */
        
    }  
     
    static void fun1(){
        try{
            throw new NullPointerException("Demo");
        }
        catch (NullPointerException e){
            System.out.println("Caught inside fun()");
        }
        /*
         * Caught inside fun()
         */
    }

    public static void main(String[] args) {
        try{
            fun();
        }
        catch(NullPointerException e){
            System.out.println("Caught in main");
        }
    }
}
