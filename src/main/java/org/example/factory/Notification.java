package org.example.factory;

import java.util.List;

public interface Notification {

    public static  final String PUSHNOTIFICATION ="PUSH";
    public static  final String SMSNOTIFICATION ="SMS";

    void notifyUsers(List<String> users);
}
