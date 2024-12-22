package DesignPatterns.CreationalDesignPatterns.Prototype;

public class Circle implements Shape{
    private int x;
    private int y;
    private String colour;
    private int radius;
    public Circle() {

    }

    public Circle(Circle circle) {
        this.x = circle.x;
        this.y = circle.y;
        this.colour = circle.colour;
        this.radius = circle.radius;
    }

    @Override
    public void setX(int x) {
        this.x = x;
    }

    @Override
    public void setY(int y) {
        this.y = y;
    }

    @Override
    public void setColour(String colour) {
          this.colour = colour;
    }

    @Override
    public int getX() {
        return x;
    }

    @Override
    public int getY() {
        return y;
    }

    @Override
    public String getColour() {
        return colour;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public Shape clone() {
        return new Circle(this);
    }
    @Override
    public String toString() {
        return "Circle{" +
                "x=" + x +
                ", y=" + y +
                ", colour='" + colour + '\'' +
                ", radius=" + radius +
                '}';
    }

}
