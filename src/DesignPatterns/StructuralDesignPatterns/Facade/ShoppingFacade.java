package DesignPatterns.StructuralDesignPatterns.Facade;

import java.util.ArrayList;
import java.util.List;

public class ShoppingFacade {
    private List<OrderPlacedSubscriber> orderPlacedSubscribers = new ArrayList<>();

    public void registerOrderPlacedSubscriber(OrderPlacedSubscriber orderPlacedSubscriber) {
        orderPlacedSubscribers.add(orderPlacedSubscriber);
    }
    public void removeOrderPlacedSubscriber(OrderPlacedSubscriber orderPlacedSubscriber) {
        orderPlacedSubscribers.remove(orderPlacedSubscriber);
    }

    public String placeAnOrder(OrderDto orderDto) {
        try {
            for (OrderPlacedSubscriber orderPlacedSubscriber : orderPlacedSubscribers) {
              orderPlacedSubscriber.placeAnOrder(orderDto);
            }
            return "The order has been placed successfully";
        }

        catch (OrderFailedException e){
            return "Order failed : " + e.getMessage();
        }
    }
}
