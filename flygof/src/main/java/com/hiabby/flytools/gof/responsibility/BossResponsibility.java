package com.hiabby.flytools.gof.responsibility;

/**
 * @desc
 * @date 2018/09/27
 **/
public class BossResponsibility extends AbstractResponsibility {
    public BossResponsibility(int level) {
        super(level);
    }

    @Override
    public void decide(String msg) {
        System.out.println("老大拍板决定了");
    }
}
