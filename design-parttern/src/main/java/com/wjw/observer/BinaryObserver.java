package com.wjw.observer;

/**
 * @author shulu.wjw
 * @date 下午9:34 2018/6/23
 */
public class BinaryObserver extends Observer {

    public BinaryObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Binary String:" + Integer.toBinaryString(subject.getState()));
    }
}
