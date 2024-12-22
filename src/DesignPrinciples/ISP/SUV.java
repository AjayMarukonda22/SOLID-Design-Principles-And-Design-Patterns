package DesignPrinciples.ISP;

public class SUV implements Car{
    @Override
    public void drive() {
        System.out.println("The person is driving SUv on the Road");
    }
}
