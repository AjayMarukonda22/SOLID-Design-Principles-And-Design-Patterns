package DesignPatterns.StructuralDesignPatterns.Adapter;

public class PaypalAdapter implements PaymentProcessor{
    @Override
    public void processPayment(double amount) {
             System.out.println("Paypal amount of " + amount + " is processed");
    }
}
