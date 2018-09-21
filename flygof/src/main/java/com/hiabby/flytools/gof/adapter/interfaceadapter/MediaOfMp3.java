package com.hiabby.flytools.gof.adapter.interfaceadapter;

/**
 * @desc
 * @date 2018/09/21
 **/
public class MediaOfMp3 extends MediaPlayShow {
    String name = "mp3";

    @Override
    public void playMp3() {
        System.out.println(name + "播放mp3格式");
    }

    @Override
    public void playMusic() {
        System.out.println(name + "播放音乐格式");
    }
}
