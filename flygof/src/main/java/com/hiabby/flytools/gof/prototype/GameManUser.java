package com.hiabby.flytools.gof.prototype;

/**
 * @desc
 * @date 2018/09/21
 **/
public class GameManUser extends GameUserPrototype {

    public GameManUser() {
        model = "man";
    }

    @Override
    public void createUser() {
        System.out.println("创建男性角色");
    }
}
