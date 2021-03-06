package com.wjw.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author shulu.wjw
 * @date 下午9:31 2018/6/23
 */
public class Subject {

    private List<Observer> observers = new ArrayList<>();

    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void notifyAllObservers(){
        observers.forEach(Observer::update);
    }

}
