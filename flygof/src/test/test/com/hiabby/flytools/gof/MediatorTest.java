package com.hiabby.flytools.gof;

import com.hiabby.flytools.gof.mediator.ChatRoom;
import com.hiabby.flytools.gof.mediator.TalkUser;
import org.junit.Test;

/**
 * @desc
 * @date 2018/10/22
 **/
public class MediatorTest {
    @Test
    public void test_mediator() {
        TalkUser user1 = new TalkUser("路人甲");
        TalkUser user2 = new TalkUser("路人丙");

        ChatRoom.sendMsg(user1, "hey, man!");
        ChatRoom.sendMsg(user2, "hi,nice to meet you!");
    }
}
