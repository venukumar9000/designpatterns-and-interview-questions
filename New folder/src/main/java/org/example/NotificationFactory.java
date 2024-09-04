package org.example;

public class NotificationFactory {

    public Notification createNotification(String channel) {
        if (channel == null || channel.isEmpty()) {
            return null;
        }

        return switch (channel) {
            case Notification.EMAIL_NOTIFICATIONS -> new EmailNotfications();
            case Notification.PUSH_NOTIFICATIONS -> new PushNotifications();
            case Notification.SMS_NOTIFICATIONS -> new SmsNotifications();
            default -> throw new IllegalArgumentException(String.format("unkown channel %s",channel));
        };

    }

}
