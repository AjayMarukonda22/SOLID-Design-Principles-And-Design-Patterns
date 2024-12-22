package DesignPatterns.CreationalDesignPatterns.Factory;

public class EmailNotification implements Notification{
    @Override
    public String sendNotification() {
        return "Sending the EMAIL Notification...";
    }
}
