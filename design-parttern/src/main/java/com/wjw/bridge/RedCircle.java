package com.wjw.bridge;

/**
 * @author shulu.wjw
 * @date 下午2:33 2018/6/22
 */
public class RedCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Draw red circle [" + radius + ", " + x + ", " + y + "]");
    }
}
