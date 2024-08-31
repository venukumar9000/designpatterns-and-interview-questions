package org.example.factory;

public class NotificationFactory {

    public Notification createNotification(String send){
        if(send==null || send.isEmpty()){
            return null;
        }

        return switch (send) {
            case Notification.PUSHNOTIFICATION -> new PushNotification();
            case Notification.SMSNOTIFICATION -> new SmsNotification();
            default -> throw new IllegalArgumentException(String.format("unknown sender %s", send));
        };
    }
}
