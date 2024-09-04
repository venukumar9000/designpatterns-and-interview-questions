package org.example;

import java.util.List;

public class EmailNotfications implements Notification{
    @Override
    public void notifyUsers(List<String> users) {
        System.out.println("Sending email notifications to the user");
    }
}
