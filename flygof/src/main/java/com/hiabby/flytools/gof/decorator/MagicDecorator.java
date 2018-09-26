package com.hiabby.flytools.gof.decorator;

/**
 * @desc 抽象装饰类
 * @date 2018/09/21
 **/
public abstract class MagicDecorator implements Immortal {
    private Immortal immortalMan;

    public MagicDecorator(Immortal immortalMan) {
        this.immortalMan = immortalMan;
    }

    @Override
    public int level() {
        return immortalMan.level();
    }

    @Override
    public void addMagic(String magicName) {
        immortalMan.addMagic(magicName);
    }

    @Override
    public void showMagicals() {
        immortalMan.showMagicals();
    }
}
