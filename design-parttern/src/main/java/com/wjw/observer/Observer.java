package com.wjw.observer;

/**
 * @author shulu.wjw
 * @date 下午9:31 2018/6/23
 */
public abstract class Observer {
    protected Subject subject;

    public abstract void update();
}
