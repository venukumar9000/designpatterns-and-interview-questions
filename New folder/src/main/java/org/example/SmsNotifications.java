package org.example;

import java.util.List;

public class SmsNotifications implements Notification{
    @Override
    public void notifyUsers(List<String> users) {
        System.out.println("sending sms notifications to the user "+users);
    }
}
