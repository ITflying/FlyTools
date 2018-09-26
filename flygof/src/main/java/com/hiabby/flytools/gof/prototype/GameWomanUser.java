package com.hiabby.flytools.gof.prototype;

/**
 * @desc
 * @date 2018/09/21
 **/
public class GameWomanUser extends GameUserPrototype {

    public GameWomanUser() {
        model = "woman";
    }

    @Override
    public void createUser() {
        System.out.println("创建女性角色");
    }
}
