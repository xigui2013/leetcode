package com.wjw.factory.abstractpattern;

import com.wjw.factory.easy.Shape;

/**
 * @author shulu.wjw
 * @date 下午11:08 2018/6/20
 */
public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {
        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
        Shape shape = shapeFactory.getshape("CIRCLE");
        shape.draw();
        AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");
        Color color = colorFactory.getColor("red");
        color.fill();
    }
}
