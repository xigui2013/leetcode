package com.wjw.prototype;

/**
 * @author shulu.wjw
 * @date 下午12:22 2018/6/21
 */
public class Ractangle extends Shape {

    public Ractangle() {
        type = "ractangle";
    }

    @Override
    void draw() {
        System.out.println("inside Ractangle::draw() method");
    }
}
