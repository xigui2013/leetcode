package com.wjw.prototype;

import java.util.Hashtable;

/**
 * @author shulu.wjw
 * @date 下午12:26 2018/6/21
 */
public class ShapeCache {

    private static Hashtable<String, Shape> shapeMap = new Hashtable<>();

    public static Shape getShape(String shapeId) {
        Shape cachedShape = shapeMap.get(shapeId);
        return (Shape) cachedShape.clone();
    }

    public static void loadCache() {
        Circle circle = new Circle();
        circle.setId("1");
        shapeMap.put(circle.getId(), circle);

        Square square = new Square();
        square.setId("2");
        shapeMap.put(square.getId(), square);

        Ractangle ractangle = new Ractangle();
        ractangle.setId("3");
        shapeMap.put(ractangle.getId(), ractangle);
    }
}
