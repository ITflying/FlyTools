package com.hiabby.flytools.gof.builder;

/**
 * @desc
 * @date 2018/09/20
 **/
public class WomanRoleBuilder implements GameRoleBuilder {
    GameRole woman = new GameRole();
    
    @Override
    public void getHead() {
        System.out.println("获取女性头部数据");
        woman.setHead("女头");
    }

    @Override
    public void getBody() {
        System.out.println("获取女性身体数据");
        woman.setBody("女身");
    }

    @Override
    public void getLeg() {
        System.out.println("获取女性腿部数据");
        woman.setLeg("女腿");
    }

    @Override
    public GameRole getGameRole() {
        return woman;
    }
}
