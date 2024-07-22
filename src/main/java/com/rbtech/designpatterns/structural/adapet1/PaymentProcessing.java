package com.rbtech.designpatterns.structural.adapet1;

public class PaymentProcessing {
    private PaymentProcessor paymentProcessor;

    public PaymentProcessing(PaymentProcessor paymentProcessor) {
        this.paymentProcessor = paymentProcessor;
    }

    public void processPayment(int amount)
    {
        paymentProcessor.pay(amount);
    }

    public static void main(String[] args) {
        PaymentProcessing paymentProcessing=new PaymentProcessing(new LegacyPaymentAdapter(new LegacyPaymentProcessor()));

        paymentProcessing.processPayment(2800);
    }
}
