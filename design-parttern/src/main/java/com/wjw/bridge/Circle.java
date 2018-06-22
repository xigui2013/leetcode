package com.wjw.bridge;

/**
 * @author shulu.wjw
 * @date 下午3:04 2018/6/22
 */
public class Circle extends Shape {

    private int x, y, radius;


    protected Circle(int x, int y, int radius, DrawAPI drawAPI) {
        super(drawAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    protected void draw() {
        drawAPI.drawCircle(radius, x, y);
    }
}
