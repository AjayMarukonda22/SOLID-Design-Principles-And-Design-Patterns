package DesignPatterns.StructuralDesignPatterns.Facade;

public class PaymentProcessing implements OrderPlacedSubscriber{
    @Override
    public void placeAnOrder(OrderDto orderDto) throws OrderFailedException{
        if(orderDto.getCardDetails() != null){
            System.out.println("The payment has been completed successfully");
            return ;
        }
        throw new OrderFailedException("Order failed : incorrect card details");
    }
}
