package com.keith.pattern.flyweight;

import java.util.HashMap;

/**
 * @author keith
 * @version 1.0
 * @date 2020-06-11
 */
public class ShapeFactory {

    private static final HashMap<String,Shap> circleMap=new HashMap<>();

    public static Shap getCircle(String color){
        Circle circle= (Circle) circleMap.get(color);
        if(circle==null){
            circle=new Circle(color);
            circleMap.put(color,circle);
            System.out.println("Creating circle of color : " + color);
        }
        return circle;
    }
}
