package com.wjw.factory.abstractpattern;

import com.wjw.factory.easy.Circle;
import com.wjw.factory.easy.Rectangle;
import com.wjw.factory.easy.Shape;
import com.wjw.factory.easy.Square;

/**
 * @author shulu.wjw
 * @date 下午11:02 2018/6/20
 */
public class ShapeFactory extends AbstractFactory {
    public Color getColor(String color) {

        return null;
    }

    public Shape getshape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }
        return null;
    }
}
