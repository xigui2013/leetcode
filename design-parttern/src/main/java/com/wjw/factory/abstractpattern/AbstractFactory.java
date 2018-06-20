package com.wjw.factory.abstractpattern;

import com.wjw.factory.easy.Shape;

/**
 * @author shulu.wjw
 * @date 下午11:00 2018/6/20
 */
public abstract class AbstractFactory {
    public abstract Color getColor(String color);
    public abstract Shape getshape(String shape);
}
