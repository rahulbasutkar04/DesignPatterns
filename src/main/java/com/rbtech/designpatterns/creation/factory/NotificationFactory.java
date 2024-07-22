package com.rbtech.designpatterns.creation.factory;

import java.util.Optional;

public class NotificationFactory {
    // Use createNotification method to get an object of type Notification
    int instanceCount=0;
    public Optional<Notification> createNotification(String notificationType) {

        if (notificationType == null) {
            return Optional.empty();
        }

        if (notificationType.equalsIgnoreCase("EMAIL")) {
            instanceCount++;
            System.out.println(instanceCount);
            if (instanceCount >= 2) {
                System.out.println("More than two instance called..");
            }else{
                return Optional.of(new EmailNotification());
            }

        }
        else if (notificationType.equalsIgnoreCase("SMS")) {
            return Optional.of(new SMSNotification());
        } else if (notificationType.equalsIgnoreCase("PUSH")) {
            return Optional.of(new PushNotification());
        }
        return Optional.empty();
    }
}
