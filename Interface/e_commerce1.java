package Interface;

import java.util.Scanner;

interface Payment {
    void process(double amount);
    void refund(double amount);
}

class CreditCardPayment implements Payment {
    @Override
    public void process(double amount) {
        System.out.println("Processing the Credit card payment of $" + amount);
    }

    @Override
    public void refund(double amount) {
        System.out.println("Refunding $" + amount + " to credit card");
    }
}

class UPIPayment implements Payment {
    @Override
    public void process(double amount) {
        System.out.println("Processing the UPI payment of $" + amount);
    }

    @Override
    public void refund(double amount) {
        System.out.println("Refunding $" + amount + " to UPI account");
    }
}

public class e_commerce1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter payment type (credit/upi): ");
        String type = sc.nextLine().trim().toLowerCase();
        System.out.print("Enter amount: $");
        double amount = sc.nextDouble();
        Payment paymentMethod;
        if (type.equals("credit")) {
            paymentMethod = new CreditCardPayment();
        } else if (type.equals("upi")) {
            paymentMethod = new UPIPayment();
        } else {
            System.out.println("Invalid payment type!");
            sc.close();
            return;
        }
        paymentMethod.process(amount);
        paymentMethod.refund(amount);
        sc.close();
    }
}
