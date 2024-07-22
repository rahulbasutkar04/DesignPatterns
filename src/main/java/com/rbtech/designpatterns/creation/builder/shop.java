package com.rbtech.designpatterns.creation.builder;

public class shop {

    public static void main(String[] args) {

        Phone phone=new PhoneBuilder().setOs("Andorid").setBattery(300).setProcessor("Qualcomm").getPhone();


        Phone phone1=new PhoneBuilder().getPhone();

        System.out.println(phone1);
    }
}
