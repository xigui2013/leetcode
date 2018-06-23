package com.wjw.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * @author shulu.wjw
 * @date 下午8:15 2018/6/23
 */
public class CareTaker {

    private List<Memento> mementoList = new ArrayList<>();

    public void add(Memento state) {
        mementoList.add(state);
    }

    public Memento get(int index) {
        return mementoList.get(index);
    }

}
