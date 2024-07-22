package com.rbtech.designpatterns.behavioural.template1;

public abstract class HouseTemplate {

    public final void buildHouse() {

        buildFoundation();
        buildWalls();
        buildWindows();
        buildRoofs();

        System.out.println("House is built Successfully");
    }


    abstract void buildWindows();



    public static void buildFoundation() {
        System.out.println("Preparing and making foundation for the building");
    }

    public static void buildRoofs() {
        System.out.println("Building the roofs");
    }

    abstract void buildWalls();
}
