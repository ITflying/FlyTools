package com.hiabby.flytools.gof.flyweight;

/**
 * @desc
 * @date 2018/09/26
 **/
public class FightAction implements GameAction {
    private String name;
    private int level;
    private int num;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public void operator() {
        System.out.println("用户等级为：" + level + "，血量为:" + num + "，发起了" + name);
    }
}
