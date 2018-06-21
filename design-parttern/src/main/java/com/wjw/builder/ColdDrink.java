package com.wjw.builder;

/**
 * @author shulu.wjw
 * @date 下午11:55 2018/6/20
 */
public abstract class ColdDrink implements Item {
    public Packing packing() {
        return new Bottle();
    }
}
