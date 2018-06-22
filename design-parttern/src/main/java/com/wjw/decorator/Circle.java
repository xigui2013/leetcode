package com.wjw.decorator;

/**
 * @author shulu.wjw
 * @date 下午3:51 2018/6/22
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("draw : circle");
    }
}
