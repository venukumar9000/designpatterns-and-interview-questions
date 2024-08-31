package org.example.factory;

import java.util.List;

public class SmsNotification implements Notification{
    @Override
    public void notifyUsers(List<String> users) {
        System.out.println("sending sms notification to users"+users);
    }
}
