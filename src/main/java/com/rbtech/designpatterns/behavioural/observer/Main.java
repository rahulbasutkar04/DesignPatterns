package com.rbtech.designpatterns.behavioural.observer;

public class Main {
    public static void main(String[] args) {
        Datasource datasource=new Datasource();

        SpreadSheet spreadSheet1=new SpreadSheet();
        SpreadSheet spreadSheet2=new SpreadSheet();
        Chart chart=new Chart();


        datasource.addObserver(spreadSheet1);
        datasource.addObserver(spreadSheet2);

        datasource.addObserver(chart);

        datasource.setValue(1);

    }
}
