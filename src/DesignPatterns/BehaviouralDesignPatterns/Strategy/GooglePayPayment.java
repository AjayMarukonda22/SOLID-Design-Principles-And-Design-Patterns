package DesignPatterns.BehaviouralDesignPatterns.Strategy;

public class GooglePayPayment implements PaymentStrategy {
    @Override
    public String pay(double amount) {
        return "Paying the amount " + amount + " through GooglePay";
    }
}
