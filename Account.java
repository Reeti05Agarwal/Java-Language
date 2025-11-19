package Codes;

class BankAccount{
    double getInterestRate() {
        return 0.0;
    }
}

class SavingAccount extends BankAccount{
    @Override
    double getInterestRate() {
        return 4.0;
    }
}

class CurrentAccount extends BankAccount{
    @Override
    double getInterestRate(){
        return 3.0;
    }
}

public class Account{
    public static void main(String[] args) {
        BankAccount b = new SavingAccount();
        BankAccount s = new CurrentAccount();
        System.out.println(b.getInterestRate());
        System.out.println(s.getInterestRate());       
    }
}

// Anottation @Override is used to override the method of parent class in child class.
// In this example, getInterestRate() method is overridden in SavingAccount and CurrentAccount class.
// The method getInterestRate() is called using the object of SavingAccount and CurrentAccount class.
// The output of the code is:
// 4.0
// 3.0