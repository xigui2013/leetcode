package com.wjw.decorator;

/**
 * @author shulu.wjw
 * @date 下午3:53 2018/6/22
 */
public abstract class ShapeDecorator implements Shape {

    protected Shape shapeDecorator;

    public ShapeDecorator(Shape shapeDecorator) {
        this.shapeDecorator = shapeDecorator;
    }

    public abstract void draw();
}
