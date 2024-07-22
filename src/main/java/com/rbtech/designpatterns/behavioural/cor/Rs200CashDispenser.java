package com.rbtech.designpatterns.behavioural.cor;

public class Rs200CashDispenser implements CashDispenser{
    private CashDispenser cashDispenser;
    @Override
    public void setNextChain(CashDispenser cashDispenser) {
        this.cashDispenser=cashDispenser;
    }

    @Override
    public void dispense(Currency currency) {
        if(currency.getAmount()>=200)
        {
            int numberOfNotes=currency.getAmount()/200;
            int remainderAmount= currency.getAmount()%200;
            System.out.println("Dispensing "+numberOfNotes+"of 200  Notes");
            if(remainderAmount!=0)
            {
                cashDispenser.dispense(new Currency(remainderAmount));
            }

        }  else {
            cashDispenser.dispense(currency);
        }
    }
}
