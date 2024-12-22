package DesignPatterns.StructuralDesignPatterns.Facade;

public class OrderFailedException extends Exception{
     String message;
    public OrderFailedException(String message){
        super(message);
    }
}
