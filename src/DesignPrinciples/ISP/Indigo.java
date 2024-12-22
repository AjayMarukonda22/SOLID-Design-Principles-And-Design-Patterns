package DesignPrinciples.ISP;

public class Indigo implements Airplane{
    @Override
    public void fly() {
        System.out.println("The Indigo airplane is flying in the sky");
    }
}
