package com.wjw.prototype;

/**
 * @author shulu.wjw
 * @date 下午12:25 2018/6/21
 */
public class Square extends Shape {

    public Square() {
        type = "Square";
    }

    @Override
    void draw() {
        System.out.println("Inside Square::draw method");
    }
}
