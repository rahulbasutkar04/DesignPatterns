package com.rbtech.designpatterns.behavioural.cor;

public class ATMCashdispencer {

    private CashDispenser cashDispenserChain1;

    public ATMCashdispencer() {
        cashDispenserChain1=new Rs2000CashDispenser();
        CashDispenser cashDispenserChain2=new Rs500CashDispenser();
        CashDispenser cashDispenserChain3=new Rs200CashDispenser();
        CashDispenser cashDispenserChain4=new Rs100CashDispenser();

        cashDispenserChain1.setNextChain(cashDispenserChain2);
        cashDispenserChain2.setNextChain(cashDispenserChain3);
        cashDispenserChain3.setNextChain(cashDispenserChain4);
    }

    public CashDispenser getCashDispenserChain1() {
        return cashDispenserChain1;
    }
}
