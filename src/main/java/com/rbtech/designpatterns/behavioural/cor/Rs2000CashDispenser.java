package com.rbtech.designpatterns.behavioural.cor;

public class Rs2000CashDispenser implements CashDispenser{
    private CashDispenser cashDispenser;
    @Override
    public void setNextChain(CashDispenser cashDispenser) {
        this.cashDispenser=cashDispenser;
    }

    @Override
    public void dispense(Currency currency) {
        if(currency.getAmount()>=2000)
        {
            int numberOfNotes=currency.getAmount()/2000;
            int remainderAmount= currency.getAmount()%2000;
            System.out.println("Dispensing "+numberOfNotes+"of 2000  Notes");
            if(remainderAmount!=0)
            {
                cashDispenser.dispense(new Currency(remainderAmount));
            }

        }  else {
            cashDispenser.dispense(currency);
        }
    }
}
