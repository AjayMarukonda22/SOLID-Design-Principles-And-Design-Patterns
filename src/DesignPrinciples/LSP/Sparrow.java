package DesignPrinciples.LSP;

public class Sparrow extends Bird implements Flyable{
    @Override
    public void fly() {
        System.out.println("Sparrow is flying in the sky");
    }
}
