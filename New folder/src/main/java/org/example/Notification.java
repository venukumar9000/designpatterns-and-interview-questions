package org.example;

import java.util.List;

public interface Notification {

    public static  final  String PUSH_NOTIFICATIONS="PUSH";
    public static  final  String SMS_NOTIFICATIONS="SMS";
    public static  final  String EMAIL_NOTIFICATIONS="EMAIL";

    void notifyUsers(List<String> users);

}
