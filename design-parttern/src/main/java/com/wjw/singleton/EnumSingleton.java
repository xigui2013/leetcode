package com.wjw.singleton;

/**
 * @author shulu.wjw
 * @date 下午11:38 2018/6/20
 */
public enum EnumSingleton {
    INSTANCE;

    public void sayMessage() {
        System.out.println("Hello world");
    }
}
