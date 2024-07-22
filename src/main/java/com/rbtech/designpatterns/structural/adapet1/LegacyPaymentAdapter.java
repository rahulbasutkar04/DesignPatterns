package com.rbtech.designpatterns.structural.adapet1;

public class LegacyPaymentAdapter implements PaymentProcessor{

    LegacyPaymentProcessor legacyPaymentProcessor;

    public LegacyPaymentAdapter(LegacyPaymentProcessor legacyPaymentProcessor) {
        this.legacyPaymentProcessor = legacyPaymentProcessor;
    }

    @Override
    public void pay(int amount) {
        System.out.println("This is new payment service");
        double amountInDollars=amount/100;
        legacyPaymentProcessor.makePayment(amountInDollars);
    }
}
