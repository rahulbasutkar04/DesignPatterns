package com.rbtech.designpatterns.behavioural.strategy1;

public class DiscountApplication {
    DiscountStrategy discountStrategy;

    public DiscountApplication(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }

    void getDiscount()
    {
        discountStrategy.giveDiscount();
    }

    void setDiscountStrategy(DiscountStrategy discountStrategy)
    {
        this.discountStrategy=discountStrategy;
    }
}
