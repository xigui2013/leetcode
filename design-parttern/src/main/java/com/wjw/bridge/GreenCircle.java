package com.wjw.bridge;

/**
 * @author shulu.wjw
 * @date 下午2:34 2018/6/22
 */
public class GreenCircle implements DrawAPI{

    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Draw green circle [" + radius + ", " + x + ", " + y + "]");
    }
}
