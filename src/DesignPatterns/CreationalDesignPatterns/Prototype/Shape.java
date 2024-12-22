package DesignPatterns.CreationalDesignPatterns.Prototype;

public interface Shape {
    void setX(int x);
    void setY(int y);
    void setColour(String colour);
    int getX();
    int getY();
    String getColour();
    Shape clone();
}
