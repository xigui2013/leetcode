package com.wjw.singleton;

/**
 * @author shulu.wjw
 * @date 下午11:32 2018/6/20
 */
public class StaticInnerClassSingleObject {

    private static class SingletonHolder {
        private static final StaticInnerClassSingleObject INSTANCE = new StaticInnerClassSingleObject();
    }

    private StaticInnerClassSingleObject() {
    }

    public static StaticInnerClassSingleObject getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
