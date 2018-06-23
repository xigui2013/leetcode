package com.wjw.state;

/**
 * @author shulu.wjw
 * @date 下午9:51 2018/6/23
 */
public class StartState implements State {
    @Override
    public void doAction(Context context) {
        System.out.println("Player is in start state");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "Start State";
    }
}
