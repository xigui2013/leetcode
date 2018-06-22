package com.wjw.adapter;

/**
 * @author shulu.wjw
 * @date 下午12:12 2018/6/22
 */
public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void play(String fileName) {
        System.out.println("Vlc player:" + fileName);
    }

}