package com.wjw.factory.easy;

/**
 * @author shulu.wjw
 * @date 下午4:43 2018/6/20
 */
public class FactoryPatternDemo {

    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape = shapeFactory.getShape("circle");
        shape.draw();
        shape = shapeFactory.getShape("rectangle");
        shape.draw();
        shape = shapeFactory.getShape("square");
        shape.draw();
    }
}
