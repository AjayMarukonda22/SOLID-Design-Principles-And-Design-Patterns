package DesignPatterns.StructuralDesignPatterns.Decorator;

public class PushDecorator extends NotificationDecorator{
    public PushDecorator(Notification notification) {
        super(notification);
    }
    @Override
    public void send(String message) {
        super.send(message);
        System.out.println("Sending Push Notification: " + message);
    }
}
