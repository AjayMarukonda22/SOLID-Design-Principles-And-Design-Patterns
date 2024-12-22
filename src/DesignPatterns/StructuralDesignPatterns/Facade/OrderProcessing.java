package DesignPatterns.StructuralDesignPatterns.Facade;

public class OrderProcessing implements OrderPlacedSubscriber{
    @Override
    public void placeAnOrder(OrderDto orderDto) throws OrderFailedException{
        if(orderDto.getProductId() != null) {
            System.out.println("The order is successfully created");
            return ;
        }
        else
            throw new OrderFailedException("The order has be failed due to incorrect product deatils");
    }
}
