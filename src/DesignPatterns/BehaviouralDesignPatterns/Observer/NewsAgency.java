package DesignPatterns.BehaviouralDesignPatterns.Observer;

import java.util.ArrayList;
import java.util.List;

public class NewsAgency {
    List<Subscriber> subscribers = new ArrayList<>();
    public void addSubscriber(Subscriber subscriber) {
        subscribers.add(subscriber);
    }
    public void notify(String news){
        for(int i = 0 ; i < subscribers.size() ; i++) {
            subscribers.get(i).update(news);
        }
    }

    public void removeSubscriber(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }
}
