package DesignPatterns.StructuralDesignPatterns.FlyWeight;

public class TextStyle {
    private String font;
    private int size;
    private String colour;
    public TextStyle(String font, int size, String colour){
        this.font = font;
        this.size = size;
        this.colour = colour;
    }
    public String toString(){
        return "Font: " + font + ", Size: " + size + ", Colour: " + colour;
    }
}
