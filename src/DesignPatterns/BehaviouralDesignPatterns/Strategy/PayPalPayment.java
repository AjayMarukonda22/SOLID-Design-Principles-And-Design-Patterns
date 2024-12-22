package DesignPatterns.BehaviouralDesignPatterns.Strategy;

import DesignPatterns.BehaviouralDesignPatterns.Strategy.PaymentStrategy;

public class PayPalPayment implements PaymentStrategy {
    @Override
    public String pay(double amount) {
        return "Paying the amount " + amount + " through PayPal";
    }
}
