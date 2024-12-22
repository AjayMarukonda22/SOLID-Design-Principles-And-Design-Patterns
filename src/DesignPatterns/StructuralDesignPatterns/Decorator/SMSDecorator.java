package DesignPatterns.StructuralDesignPatterns.Decorator;

public class SMSDecorator extends NotificationDecorator{
    public SMSDecorator(Notification notification) {
        super(notification);
    }
    @Override
    public void send(String message){
        super.send(message);
        System.out.println("Sending SMS: " + message);
    }
}
