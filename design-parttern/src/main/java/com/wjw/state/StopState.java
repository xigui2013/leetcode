package com.wjw.state;

/**
 * @author shulu.wjw
 * @date 下午9:54 2018/6/23
 */
public class StopState implements State {

    @Override
    public void doAction(Context context) {
        System.out.println("Player is in stop state");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "StopState{}";
    }
}
