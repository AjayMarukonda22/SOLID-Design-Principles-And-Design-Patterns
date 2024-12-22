package DesignPatterns.CreationalDesignPatterns.Factory;

public class NotificationFactory {

    public static Notification createNotification(String mode){
           if(mode.equalsIgnoreCase("EMAIL"))
               return new EmailNotification();
           else if(mode.equalsIgnoreCase("SMS"))
               return new SMSNotification();
           else if(mode.equalsIgnoreCase("PUSH"))
               return new PushNotification();
           else
               throw new RuntimeException("Sorry the notification type is unsupported");

    }
}
