package org.example.factory;

import java.util.List;

public class PushNotification implements Notification{
    @Override
    public void notifyUsers(List<String> users) {
        System.out.println("sending pushnotification to the user"+users);
    }
}
