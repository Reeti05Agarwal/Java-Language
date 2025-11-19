package Codes;

public class Methods {
    private int id;
    private String name;
    private float balance;

    public void deposit(float amt){
        balance += amt;
    }
    public void withdraw(float amt){
        balance -= amt;
    }
    public float getBalance(){
        return balance;
    }

    public static void main(String[] args){
        Methods obj = new Methods();
        obj.deposit(1000);
        obj.withdraw(500);
        System.out.println("Balance: " + obj.getBalance());
    }
}
