package com.wjw.Compositeentity;

/**
 * @author shulu.wjw
 * @date 上午11:04 2018/6/24
 */
public class CompositeEntity {

    private CoarseGrainedObject cgo = new CoarseGrainedObject();

    public void setData(String data1, String data2) {
        cgo.setData(data1, data2);
    }

    public String[] getData() {
        return cgo.getData();
    }
}
