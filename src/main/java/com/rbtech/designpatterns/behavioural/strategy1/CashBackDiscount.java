package com.rbtech.designpatterns.behavioural.strategy1;

public class CashBackDiscount implements DiscountStrategy{
    @Override
    public void giveDiscount() {
        System.out.println("Applying Cash Back Discount");
    }
}
