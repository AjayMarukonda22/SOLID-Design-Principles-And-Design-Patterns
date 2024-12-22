package DesignPatterns.StructuralDesignPatterns.Adapter;

public class Stripe {
    private PaymentProcessor paymentProcessor;

    public Stripe(PaymentProcessor paymentProcessor) {
        this.paymentProcessor = paymentProcessor;
    }


    public PaymentProcessor getPaymentProcessor() {
        return paymentProcessor;
    }

    public void setPaymentProcessor(PaymentProcessor paymentProcessor) {
        this.paymentProcessor = paymentProcessor;
    }

    public void makePayment(double amount) {
        paymentProcessor.processPayment(amount);
    }
}
