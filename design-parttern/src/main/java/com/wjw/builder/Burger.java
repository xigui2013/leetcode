package com.wjw.builder;

/**
 * @author shulu.wjw
 * @date 下午11:54 2018/6/20
 */
public abstract class Burger implements Item {
    public Packing packing() {
        return new Wrapper();
    }
}
