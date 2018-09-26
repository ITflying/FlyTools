package com.hiabby.flytools.gof.decorator;

/**
 * @desc
 * @date 2018/09/21
 **/
public class ChangeMagic extends MagicDecorator {
    private String magicName;

    public ChangeMagic(Immortal immortalMan, String magicName) {
        super(immortalMan);
        this.magicName = magicName;
    }

    @Override
    public int level() {
        return super.level() + 1;
    }

    @Override
    public void showMagicals() {
        super.addMagic(magicName);
        super.showMagicals();
    }
}
