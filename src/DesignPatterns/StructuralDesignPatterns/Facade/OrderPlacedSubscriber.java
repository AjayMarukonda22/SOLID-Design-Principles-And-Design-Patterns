package DesignPatterns.StructuralDesignPatterns.Facade;

public interface OrderPlacedSubscriber {
    void placeAnOrder(OrderDto orderDto) throws OrderFailedException;
}
