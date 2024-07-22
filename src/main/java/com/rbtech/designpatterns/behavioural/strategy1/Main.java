package com.rbtech.designpatterns.behavioural.strategy1;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        DiscountApplication discountApplication=new DiscountApplication(new CoupanDiscount());
        discountApplication.getDiscount();

        discountApplication.setDiscountStrategy(new CashBackDiscount());

        discountApplication.getDiscount();

    }
}
