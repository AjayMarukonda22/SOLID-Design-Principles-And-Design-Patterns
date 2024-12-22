package DesignPatterns.CreationalDesignPatterns.Prototype;

import java.util.HashMap;
import java.util.Map;

public class ShapeCache {
    Map<String, Shape> shapeMap = new HashMap<>();

    public void registerShape(String key, Shape value){
        shapeMap.put(key, value);
    }

    public Shape getShape(String key) {
        return shapeMap.get(key);
    }
}
