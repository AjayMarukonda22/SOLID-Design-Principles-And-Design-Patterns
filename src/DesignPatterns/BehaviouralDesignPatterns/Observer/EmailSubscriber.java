package DesignPatterns.BehaviouralDesignPatterns.Observer;

public class EmailSubscriber implements Subscriber {

    @Override
    public void update(String news) {
        System.out.println(news + " received through Email");
    }
}
