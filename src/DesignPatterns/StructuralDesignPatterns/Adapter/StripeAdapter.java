package DesignPatterns.StructuralDesignPatterns.Adapter;

public class StripeAdapter implements PaymentProcessor{
    @Override
    public void processPayment(double amount) {
        System.out.println("Stripe amount of " + amount + " processed");
    }
}
