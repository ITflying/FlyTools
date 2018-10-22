package com.hiabby.flytools.gof.mediator;

import java.util.Date;

/**
 * @desc
 * @date 2018/10/22
 **/
public class ChatRoom {
    public static void sendMsg(TalkUser user, String msg) {
        System.out.println(user.getName() + "(" + new Date().toString() + "):" + msg);
    }
}
