package DesignPatterns.StructuralDesignPatterns.Facade;

public class Shipping implements OrderPlacedSubscriber{
    @Override
    public void placeAnOrder(OrderDto orderDto) throws OrderFailedException {
        if(orderDto.getAddress() != null) {
            System.out.println("The order has being shipped and ready to reach your location soon");
            return ;
        }
        throw new OrderFailedException("Order failed : incorrect shipping details");
    }
}
