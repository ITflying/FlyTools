package com.hiabby.flytools.gof.flyweight;

import com.google.common.collect.Maps;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Objects;

/**
 * @desc
 * @date 2018/09/26
 **/
public class GameActionFacotry {
    private static final HashMap<String, FightAction> gameActionMap = new HashMap<>();

    public static FightAction getFightAction(String name) {
        FightAction fightAction = gameActionMap.get(name);
        if (Objects.isNull(fightAction)) {
            fightAction = new FightAction();
            fightAction.setName(name);
            fightAction.setLevel(gameActionMap.size() + 1);
            fightAction.setNum(new BigDecimal(gameActionMap.size() + 1).intValue());
            gameActionMap.put(name, fightAction);
        }
        return fightAction;
    }

    public static void getSize() {
        System.out.println("对象池中数量为：" + gameActionMap.size() + "\n");
    }
}
