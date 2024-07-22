package com.rbtech.designpatterns.structural.facade;

public class ZomatoFacade {
    private Restaurant restaurant=new Restaurant();
    private  DeliveryBoy deliveryBoy=new DeliveryBoy();
    private DeliveryTeam deliveryTeam=new DeliveryTeam();

    public  void placeOrder() {

        System.out.println("Order Accepted...");
        restaurant.prepareOrder();
        deliveryTeam.assignDeliveryBoy();
        deliveryBoy.pickUpOrder();
        deliveryBoy.deliverOrder();
    }
}