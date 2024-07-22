package com.rbtech.designpatterns.behavioural.strategy1;

public class FlatDiscount implements DiscountStrategy{
    @Override
    public void giveDiscount() {
        System.out.println("Applying Flat Discount");
    }
}
