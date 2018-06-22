package com.wjw.bridge;

/**
 * @author shulu.wjw
 * @date 下午3:06 2018/6/22
 */
public class BridgePatternDemo {
    public static void main(String[] args) {
        Shape redCircle = new Circle(100, 10, 10, new RedCircle());
        Shape greenCircle = new Circle(100, 10, 10, new GreenCircle());

        redCircle.draw();
        greenCircle.draw();
    }
}
