package com.wjw.prototype;

/**
 * @author shulu.wjw
 * @date 上午11:59 2018/6/21
 */
public class Circle extends Shape {

    public Circle() {
        type = "Circle";
    }

    @Override
    void draw() {
        System.out.println("Inside circle::draw method");
    }
}
