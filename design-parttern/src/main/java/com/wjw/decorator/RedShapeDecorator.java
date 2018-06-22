package com.wjw.decorator;

/**
 * @author shulu.wjw
 * @date 下午3:56 2018/6/22
 */
public class RedShapeDecorator extends ShapeDecorator {
    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        shapeDecorator.draw();
        setRedBorder(shapeDecorator);
    }

    private void setRedBorder(Shape decoratedShape) {
        System.out.println("Border Color: Red");
    }
}
