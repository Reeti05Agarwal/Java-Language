package Codes;

import java.util.Scanner;

// Payment Interface
interface PaymentMethod {
    boolean processPayment(double amount);
}

// Credit Card Payment Implementation
class CreditCardPayment implements PaymentMethod {
    private String cardNumber;
    private String cvv;

    public CreditCardPayment(String cardNumber, String cvv) {
        this.cardNumber = cardNumber;
        this.cvv = cvv;
    }

    @Override
    public boolean processPayment(double amount) {
        // Simulate credit card processing logic
        System.out.println("Processing credit card payment to " + cardNumber + " of Rs." + amount);
        return true; // Simulating successful transaction
    }
}

// Bank Transfer Payment Implementation
class BankTransferPayment implements PaymentMethod {
    private String accountNumber;
    private String ifscCode;

    public BankTransferPayment(String accountNumber, String ifscCode) {
        this.accountNumber = accountNumber;
        this.ifscCode = ifscCode;
    }

    @Override
    public boolean processPayment(double amount) {
        // Simulate bank transfer processing logic
        System.out.println("Processing bank transfer payment to " + accountNumber +" of Rs." + amount);
        return true;
    }
}

// UPI Payment Implementation
class UpiPayment implements PaymentMethod {
    private String upiId;

    public UpiPayment(String upiId) {
        this.upiId = upiId;
    }

    @Override
    public boolean processPayment(double amount) {
        // Simulate UPI payment processing logic
        System.out.println("Processing UPI payment to " + upiId + "of Rs." + amount);
        return true;
    }
}


// Main Payment Gateway
public class Payment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select Payment Method: \n1. Credit Card \n2. Bank Transfer \n3. UPI");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        PaymentMethod paymentMethod = null;
        double amount;

        switch (choice) {
            case 1:
                System.out.print("Enter Card Number: ");
                String cardNumber = scanner.nextLine();
                System.out.print("Enter CVV: ");
                String cvv = scanner.nextLine();
                paymentMethod = new CreditCardPayment(cardNumber, cvv);
                break;
            case 2:
                System.out.print("Enter Account Number: ");
                String accountNumber = scanner.nextLine();
                System.out.print("Enter IFSC Code: ");
                String ifscCode = scanner.nextLine();
                paymentMethod = new BankTransferPayment(accountNumber, ifscCode);
                System.out.println("Account Number: " + accountNumber);
                break;
            case 3:
                System.out.print("Enter UPI ID: ");
                String upiId = scanner.nextLine();
                paymentMethod = new UpiPayment(upiId);
                System.out.println("UPI ID: " + upiId);
                break;
            default:
                System.out.println("Invalid choice!");
                scanner.close();
                return;
        }

        System.out.print("Enter Amount: ");
        amount = scanner.nextDouble();
        
        if (paymentMethod != null && paymentMethod.processPayment(amount)) {
            System.out.println("Payment Successful!");
        } else {
            System.out.println("Payment Failed!");
        }

        scanner.close();
    }
}
