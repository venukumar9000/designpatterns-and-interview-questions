package org.example;

import java.util.List;

public class PushNotifications implements Notification{
    @Override
    public void notifyUsers(List<String> users) {
        System.out.println("sending push notifications to user "+users);
    }
}
