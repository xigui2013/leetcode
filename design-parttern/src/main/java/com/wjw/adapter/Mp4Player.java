package com.wjw.adapter;

/**
 * @author shulu.wjw
 * @date 下午12:13 2018/6/22
 */
public class Mp4Player implements AdvancedMediaPlayer {

    @Override
    public void play(String fileName) {
        System.out.println("mp4 player:" + fileName);
    }
}
