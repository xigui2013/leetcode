package com.wjw.bridge;

/**
 * @author shulu.wjw
 * @date 下午3:02 2018/6/22
 */
public abstract class Shape {
    protected DrawAPI drawAPI;

    protected Shape(DrawAPI drawAPI) {
        this.drawAPI = drawAPI;
    }

    protected abstract void draw();
}
