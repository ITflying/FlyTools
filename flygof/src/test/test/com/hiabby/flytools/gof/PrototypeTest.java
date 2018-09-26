package com.hiabby.flytools.gof;

import com.hiabby.flytools.gof.prototype.GameManUser;
import com.hiabby.flytools.gof.prototype.GameWomanUser;
import org.junit.Test;

/**
 * @desc
 * @date 2018/09/20
 **/
public class PrototypeTest {

    @Test
    public void test_game_user_prototype() {
        GameManUser gameManUser = new GameManUser();
        for (int i = 0; i < 10; i++) {
            GameManUser clonecp = (GameManUser) gameManUser.clone();
            clonecp.createUser();
        }

        System.out.println("---------- 分割线 ------------");
        GameWomanUser gameWomanUser = new GameWomanUser();
        for (int i = 0; i < 10; i++) {
            GameWomanUser clonecp = (GameWomanUser) gameWomanUser.clone();
            clonecp.createUser();
            if (clonecp == gameWomanUser) {
                System.out.println("浅拷贝");
            }
        }
    }
}
