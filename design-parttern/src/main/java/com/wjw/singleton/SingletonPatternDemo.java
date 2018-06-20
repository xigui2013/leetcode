package com.wjw.singleton;

/**
 * @author shulu.wjw
 * @date 下午11:15 2018/6/20
 */
public class SingletonPatternDemo {
    public static void main(String[] args) {
        EasySingleObject easySingleObject = EasySingleObject.getInstance();
        easySingleObject.showMessage();
        EnumSingleton enumSingleton = EnumSingleton.INSTANCE;
        enumSingleton.sayMessage();
    }
}
