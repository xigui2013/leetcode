package com.wjw.singleton;

/**
 * @author shulu.wjw
 * @date 下午11:28 2018/6/20
 */
public class StaticSingleObject {

    private static StaticSingleObject instance;

    private StaticSingleObject() {
    }

    public static synchronized StaticSingleObject getInstance() {
        if (instance == null) {
            instance = new StaticSingleObject();
        }
        return instance;
    }

}
