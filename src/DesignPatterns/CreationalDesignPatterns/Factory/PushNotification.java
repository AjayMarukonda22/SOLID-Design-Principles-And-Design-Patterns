package DesignPatterns.CreationalDesignPatterns.Factory;

public class PushNotification implements Notification{
    @Override
    public String sendNotification() {
        return "Sending the Push Notification.....";
    }
}
