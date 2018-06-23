package com.wjw.observer;

/**
 * @author shulu.wjw
 * @date 下午9:39 2018/6/23
 */
public class HexaObserver extends Observer {

    public HexaObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Hex String:" + Integer.toHexString(subject.getState()).toUpperCase());
    }
}
