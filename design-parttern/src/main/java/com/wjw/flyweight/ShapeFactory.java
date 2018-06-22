package com.wjw.flyweight;

import java.util.HashMap;

/**
 * @author shulu.wjw
 * @date 下午5:16 2018/6/22
 */
public class ShapeFactory {
    private static final HashMap<String, Shape> circleMap = new HashMap<>();

    public static Shape getCircle(String color) {
        Circle circle = (Circle) circleMap.get(color);
        if (circle == null) {
            circle = new Circle(color);
            circleMap.put(color, circle);
            System.out.println("Create circle : " + color);
        }
        return circle;
    }
}
