package Codes;

class Account {
    String name;
    double balance;

    // Constructor to initialize the account
    Account(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    // Method to deposit an amount to the account
    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Method to withdraw an amount from the account
    void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
        } else {
            System.out.println("Insufficient balance for withdrawal.");
        }
    }

    // Method to display account details
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Balance: " + balance);
        System.out.println("--------------------");
    }

    // Method to transfer money from one account to another
    void transfer(Account account, double amount) {
        if (amount <= 0) {
            System.out.println("Invalid transfer amount.");
            return;
        }

        // Withdraw from the current account
        if (balance >= amount) {
            withdraw(amount);  // Withdraw from this account

            // Deposit to the destination account
            account.deposit(amount);  // Deposit to the target account

            System.out.println("Transferred " + amount + " from " + this.name + " to " + account.name);
        } else {
            System.out.println("Insufficient balance to transfer.");
        }
    }
}

public class Bank {
    public static void main(String[] args) {
        // Creating two account objects
        Account account1 = new Account("John", 1000);
        Account account2 = new Account("Doe", 500);

        // Display initial balances
        account1.display();
        account2.display();

        // Performing some transactions
        account1.deposit(500);  // Deposit 500 into John’s account
        account1.withdraw(200);  // Withdraw 200 from John’s account

        // Display balances after deposit and withdrawal
        System.out.println("After transactions:");
        account1.display();
        account2.display();

        // Transfer money from John to Doe
        account1.transfer(account2, 300);

        // Display final balances after transfer
        System.out.println("After transfer:");
        account1.display();
        account2.display();
    }
}
