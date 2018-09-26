package com.hiabby.flytools.gof;

import com.hiabby.flytools.gof.flyweight.FightAction;
import com.hiabby.flytools.gof.flyweight.GameActionFacotry;
import org.junit.Test;

/**
 * @desc
 * @date 2018/09/26
 **/
public class FlyweightTest {
    @Test
    public void test_flyweight() {
        String name = "攻击";

        for (int i = 0; i < 5; i++) {
            FightAction fightAction = GameActionFacotry.getFightAction(name);
            fightAction.operator();
            GameActionFacotry.getSize();
        }
    }
}
