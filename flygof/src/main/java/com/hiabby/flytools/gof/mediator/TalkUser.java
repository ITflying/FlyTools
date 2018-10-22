package com.hiabby.flytools.gof.mediator;

/**
 * @desc
 * @date 2018/10/22
 **/
public class TalkUser {
    private String name;

    public TalkUser(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void sendMessage(String message) {
        ChatRoom.sendMsg(this, message);
    }
}
