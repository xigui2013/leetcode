package com.wjw.singleton;

/**
 * @author shulu.wjw
 * @date 下午11:30 2018/6/20
 */
public class DoubleCheckSingleObject {
    private static DoubleCheckSingleObject instance;

    private DoubleCheckSingleObject() {
    }

    public static DoubleCheckSingleObject getInstance() {
        if (instance == null) {
            synchronized (DoubleCheckSingleObject.class) {
                if (instance == null) {
                    instance = new DoubleCheckSingleObject();
                }
            }
        }
        return instance;
    }
}
