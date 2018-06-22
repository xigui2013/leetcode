package com.wjw.adapter;

/**
 * @author shulu.wjw
 * @date 下午12:14 2018/6/22
 */
public class MediaAdapter implements MediaPlayer {
    private AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter(String audioType) {
        if (audioType.equalsIgnoreCase("vlc")) {
            advancedMediaPlayer = new VlcPlayer();
        } else if (audioType.equalsIgnoreCase("mp4")) {
            advancedMediaPlayer = new Mp4Player();
        }

    }

    @Override
    public void play(String audioType, String fileName) {
        if (advancedMediaPlayer == null) {
            System.out.println("invalid audio type:" + audioType);
        }
        advancedMediaPlayer.play(fileName);
    }
}
