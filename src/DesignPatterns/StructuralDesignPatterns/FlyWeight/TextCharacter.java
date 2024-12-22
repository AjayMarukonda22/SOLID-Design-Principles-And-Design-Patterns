package DesignPatterns.StructuralDesignPatterns.FlyWeight;

public class TextCharacter {
    private char character;
    private TextStyle textStyle;
    public TextCharacter(char character, TextStyle textStyle){
        this.character = character;
        this.textStyle = textStyle;
    }

    public void display(){
        System.out.println("Character: " + character + ", Style: " + textStyle.toString());
    }
}
