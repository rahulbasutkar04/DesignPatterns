package com.rbtech.designpatterns.behavioural.cor;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        ATMCashdispencer atmCashdispencer = new ATMCashdispencer();
        Scanner scanner = null;

        while(true){
        int amount = 0;
        try {
            System.out.println("Enter Amount to dispense:");
            scanner = new Scanner(System.in);
            amount = scanner.nextInt();

            if (amount % 100 != 0) {
                System.out.println("Amount should be multiple of rs 100");
            } else {
                atmCashdispencer.getCashDispenserChain1().dispense(new Currency(amount));
            }

        } catch (Exception e) {
            e.printStackTrace();

        }
    }
    }
}
