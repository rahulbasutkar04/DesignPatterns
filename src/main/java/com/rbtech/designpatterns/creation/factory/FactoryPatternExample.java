package com.rbtech.designpatterns.creation.factory;

import java.util.Optional;

public class FactoryPatternExample {
    public static void main(String[] args) {
        NotificationFactory notificationFactory = new NotificationFactory();

        Optional<Notification> notification = notificationFactory.createNotification("EMAIL");
        notification.ifPresent(notification2 -> notification2.notifyUser());

        notification = notificationFactory.createNotification("SMS");
        notification.ifPresent(Notification::notifyUser);

        notification = notificationFactory.createNotification("PUSH");
        notification.ifPresent(Notification::notifyUser);

        notification = notificationFactory.createNotification("EMAIL");
        notification.ifPresentOrElse(
                notification1 -> notification1.notifyUser(),
                () -> System.out.println("No notification created for EMAIL")
        );

    }
}
