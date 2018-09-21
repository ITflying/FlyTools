package com.hiabby.flytools.gof.decorator;

/**
 * @desc
 * @date 2018/09/21
 **/
public class ArmsMagic extends MagicDecorator {
    private String armsName;

    public ArmsMagic(Immortal immortalMan, String armsName){
        super(immortalMan);
        this.armsName = armsName;
    }

    @Override
    public int level() {
        return  super.level() + 1;
    }

    @Override
    public void showMagicals() {
        super.addMagic(armsName);
        super.showMagicals();
    }
}
