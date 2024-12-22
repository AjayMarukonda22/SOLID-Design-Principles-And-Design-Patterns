package DesignPatterns.BehaviouralDesignPatterns.Strategy;

public class PaymentProcessor {
    private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public String makePayment(double amount) {
        return paymentStrategy.pay(amount);
    }
}
