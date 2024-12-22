package DesignPatterns.BehaviouralDesignPatterns.Strategy;

public class CreditCardPayment implements PaymentStrategy {
    @Override
    public String pay(double amount) {
        return "Paying the amount " + amount + " through CreditCard";
    }
}
