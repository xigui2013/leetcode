package com.wjw.factory.abstractpattern;

import com.wjw.factory.easy.Shape;

/**
 * @author shulu.wjw
 * @date 下午10:58 2018/6/20
 */
public class ColorFactory extends AbstractFactory {
    public Color getColor(String colorType) {
        if (colorType == null) {
            return null;
        }
        if (colorType.equalsIgnoreCase("red")) {
            return new Red();
        } else if (colorType.equalsIgnoreCase("green")) {
            return new Green();
        } else if (colorType.equalsIgnoreCase("blue")) {
            return new Blue();
        }
        return null;
    }

    public Shape getshape(String shape) {
        return null;
    }
}
