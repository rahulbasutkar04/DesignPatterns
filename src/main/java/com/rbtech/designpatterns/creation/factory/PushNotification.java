package com.rbtech.designpatterns.creation.factory;

public class PushNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("Sending a Push Notification");
    }
}