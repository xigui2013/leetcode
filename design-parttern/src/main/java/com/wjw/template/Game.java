package com.wjw.template;

/**
 * @author shulu.wjw
 * @date 下午10:38 2018/6/23
 */
public abstract class Game {
    abstract void initialize();

    abstract void startPlay();

    abstract void endPlay();

    public final void play() {
        initialize();
        startPlay();
        endPlay();
    }

}
