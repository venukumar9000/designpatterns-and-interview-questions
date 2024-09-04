package org.example.factory;

import java.util.List;

public class AppMain {
    public static void main(String[] args){
        NotificationFactory  notificationFactory = new NotificationFactory();
        Notification notification=notificationFactory.createNotification(Notification.PUSHNOTIFICATION);
        notification.notifyUsers(List.of("mani", "pintu"));
    }
}
