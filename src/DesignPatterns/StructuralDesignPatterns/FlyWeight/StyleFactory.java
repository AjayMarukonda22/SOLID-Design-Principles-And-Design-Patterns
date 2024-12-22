package DesignPatterns.StructuralDesignPatterns.FlyWeight;

import java.util.HashMap;

public class StyleFactory {
    private static HashMap<String, TextStyle> hm = new HashMap<>();
    public static TextStyle getTextStyle(String font, int size, String colour){
        String style = font + size + colour;
        if(!hm.containsKey(style)){
            hm.put(style, new TextStyle(font, size, colour));
        }
        return hm.get(style);
    }
}
