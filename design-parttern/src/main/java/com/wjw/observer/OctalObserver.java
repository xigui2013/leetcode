package com.wjw.observer;

/**
 * @author shulu.wjw
 * @date 下午9:36 2018/6/23
 */
public class OctalObserver extends Observer {

    public OctalObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Octal String:" + Integer.toOctalString(subject.getState()));
    }
}
