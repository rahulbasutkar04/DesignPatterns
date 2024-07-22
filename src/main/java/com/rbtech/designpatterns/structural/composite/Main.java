package com.rbtech.designpatterns.structural.composite;

import com.rbtech.designpatterns.structural.composite.Component;
import com.rbtech.designpatterns.structural.composite.Composite;
import com.rbtech.designpatterns.structural.composite.Leaf;

// client
public class Main {
    public static void main(String[] args) {

        // leafs
        Component hdd = new Leaf("HDD", 400);
        Component keyBoard = new Leaf("Keyborad", 200);
        Component mouse = new Leaf("mouse", 500);
        Component ram = new Leaf("ram", 3000);
        Component processor = new Leaf("Processor", 10000);

        Composite computer = new Composite("Computer");

        Composite motherboard = new Composite("motherboard");
        motherboard.addComponent(ram);
        motherboard.addComponent(processor);

        Composite cabinet = new Composite("cabinet");
        cabinet.addComponent(hdd);
        cabinet.addComponent(motherboard);

        Composite peripherals = new Composite("peripherals");
        peripherals.addComponent(keyBoard);
        peripherals.addComponent(mouse);
        peripherals.removeComponent(hdd);


        peripherals.showPrice();

        computer.addComponent(cabinet);
        computer.addComponent(peripherals);


        computer.showPrice();
        computer.showName();



        Leaf l=new Leaf("HDD",200);
        l.showName();





    }
}
