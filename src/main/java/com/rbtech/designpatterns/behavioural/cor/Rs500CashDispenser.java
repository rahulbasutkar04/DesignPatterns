package com.rbtech.designpatterns.behavioural.cor;

public class Rs500CashDispenser implements CashDispenser{
    private CashDispenser cashDispenser;
    @Override
    public void setNextChain(CashDispenser cashDispenser) {
        this.cashDispenser=cashDispenser;
    }

    @Override
    public void dispense(Currency currency) {
        if(currency.getAmount()>=500)
        {
            int numberOfNotes=currency.getAmount()/500;
            int remainderAmount= currency.getAmount()%500;
            System.out.println("Dispensing "+numberOfNotes+"of 500  Notes");
            if(remainderAmount!=0)
            {
                cashDispenser.dispense(new Currency(remainderAmount));
            }

        }  else {
            cashDispenser.dispense(currency);
        }
    }
}
