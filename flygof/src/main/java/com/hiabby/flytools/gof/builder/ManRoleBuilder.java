package com.hiabby.flytools.gof.builder;

/**
 * @desc
 * @date 2018/09/20
 **/
public class ManRoleBuilder implements GameRoleBuilder {
    GameRole man = new GameRole();

    @Override
    public void getHead() {
        System.out.println("获取男性头部数据");
        man.setHead("男头");
    }

    @Override
    public void getBody() {
        System.out.println("获取男性身体数据");
        man.setBody("男身");
    }

    @Override
    public void getLeg() {
        System.out.println("获取男性腿部数据");
        man.setLeg("男腿");
    }

    @Override
    public GameRole getGameRole() {
        return man;
    }
}
