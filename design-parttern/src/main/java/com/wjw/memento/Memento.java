package com.wjw.memento;

/**
 * @author shulu.wjw
 * @date 下午8:12 2018/6/23
 */
public class Memento {
    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
