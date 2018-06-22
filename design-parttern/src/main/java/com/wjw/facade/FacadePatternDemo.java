package com.wjw.facade;

/**
 * @author shulu.wjw
 * @date 下午5:09 2018/6/22
 */
public class FacadePatternDemo {

    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();

        shapeMaker.drawCircle();

        shapeMaker.drawRectangle();

        shapeMaker.drawSquare();
    }
}
