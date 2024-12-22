package DesignPatterns.StructuralDesignPatterns.Adapter;

public class Paypal {
    private PaymentProcessor paymentProcessor;

    public Paypal(PaymentProcessor paymentProcessor) {
        this.paymentProcessor = paymentProcessor;
    }

    public PaymentProcessor getPaymentProcessor() {
        return paymentProcessor;
    }

    public void setPaymentProcessor(PaymentProcessor paymentProcessor) {
        this.paymentProcessor = paymentProcessor;
    }

    public void sendPayment(double amount){
        paymentProcessor.processPayment(amount);
    }
}
