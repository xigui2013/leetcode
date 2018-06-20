package com.wjw.singleton;

/**
 * @author shulu.wjw
 * @date 下午11:24 2018/6/20
 */
public class EasySingleObject {
    private static EasySingleObject instance = new EasySingleObject();

    private EasySingleObject() {
    }

    public static EasySingleObject getInstance() {
        return instance;
    }

    public void showMessage() {
        System.out.println("hello world");
    }

}
