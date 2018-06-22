package com.wjw.adapter;

/**
 * @author shulu.wjw
 * @date 下午12:16 2018/6/22
 */
public class AudioPlayer implements MediaPlayer {

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("mp3")) {
            System.out.println("Playing mp3 file. name:" + fileName);
        } else if (audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")) {
            MediaPlayer mediaPlayer = new MediaAdapter(audioType);
            mediaPlayer.play(audioType, fileName);
        } else {
            System.out.println("Invalid media. " + audioType + " format not supported");
        }
    }
}
