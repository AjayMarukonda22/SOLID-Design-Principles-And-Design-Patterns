package DesignPatterns.StructuralDesignPatterns.Facade;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InventoryManagement implements OrderPlacedSubscriber{
    private Map<String, Integer> inventory = new HashMap<>();

    public InventoryManagement() {
        // Initialize inventory in constructor
        inventory.put("product123", 2);
    }
    @Override
    public void placeAnOrder(OrderDto orderDto) throws OrderFailedException {
        if(inventory.containsKey(orderDto.getProductId())){
            int currStock = inventory.get(orderDto.getProductId());
            if(currStock < orderDto.getQuantity())
                throw new OrderFailedException("Order failed : out of stock");
            inventory.put(orderDto.getProductId(), currStock - orderDto.getQuantity());
            System.out.println("The order has been dispatched from inventory");
            return ;
        }
        else
            throw new OrderFailedException("Order failed : product not in stock");
    }

}
