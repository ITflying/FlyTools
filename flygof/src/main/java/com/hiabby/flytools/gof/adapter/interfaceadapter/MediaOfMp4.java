package com.hiabby.flytools.gof.adapter.interfaceadapter;

/**
 * @desc
 * @date 2018/09/21
 **/
public class MediaOfMp4 extends MediaPlayShow {
    String name = "mp4";

    @Override
    public void playMp3() {
        System.out.println(name + "播放mp3格式");
    }

    @Override
    public void playMp4() {
        System.out.println(name + "播放mp4格式");
    }

    @Override
    public void playMusic() {
        System.out.println(name + "播放音乐格式");
    }

    @Override
    public void playMovie() {
        System.out.println(name + "播放电影格式");
    }
}
