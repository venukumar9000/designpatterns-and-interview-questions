package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        NotificationFactory notificationFactory = new NotificationFactory();
        Notification notification= notificationFactory.createNotification(Notification.PUSH_NOTIFICATIONS);
        notification.notifyUsers(List.of("mani","sunny","bunny"));
    }
}