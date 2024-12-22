package DesignPatterns.BehaviouralDesignPatterns.Observer;

public class MobileAppSubscriber implements Subscriber{

    @Override
    public void update(String news) {
        System.out.println(news + " received through MobileApp");
    }
}
