package com.rbtech.designpatterns.behavioural.strategy1;

public class CoupanDiscount implements DiscountStrategy{
    @Override
    public void giveDiscount() {
        System.out.println("Applying Coupan Discount");
    }
}
