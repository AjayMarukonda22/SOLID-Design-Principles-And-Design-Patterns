package DesignPatterns.BehaviouralDesignPatterns.Observer;

public class SmsSubscriber implements Subscriber{
    @Override
    public void update(String news) {
        System.out.println(news + " received through Sms");
    }
}