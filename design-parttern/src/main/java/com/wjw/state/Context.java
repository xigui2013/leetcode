package com.wjw.state;

/**
 * @author shulu.wjw
 * @date 下午9:49 2018/6/23
 */
public class Context {
    private State state;

    public Context() {
        this.state = null;
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }
}
