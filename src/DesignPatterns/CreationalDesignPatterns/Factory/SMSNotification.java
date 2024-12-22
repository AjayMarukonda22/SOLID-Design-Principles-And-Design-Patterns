package DesignPatterns.CreationalDesignPatterns.Factory;

public class SMSNotification implements Notification{
    @Override
    public String sendNotification() {
        return "Sending the SMS Notification....";
    }
}
