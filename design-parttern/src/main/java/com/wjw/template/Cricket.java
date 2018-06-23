package com.wjw.template;

/**
 * @author shulu.wjw
 * @date 下午10:40 2018/6/23
 */
public class Cricket extends Game {
    @Override
    void initialize() {
        System.out.println("Cricket Game Initialized! Start playing");
    }

    @Override
    void startPlay() {
        System.out.println("Cricket Game Started. ");
    }

    @Override
    void endPlay() {
        System.out.println("Cricket Game Finished");
    }
}
