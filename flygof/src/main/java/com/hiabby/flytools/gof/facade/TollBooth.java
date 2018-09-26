package com.hiabby.flytools.gof.facade;

/**
 * @desc
 * @date 2018/09/21
 **/
public class TollBooth implements Hospital {
    private String name = "收费处";

    @Override
    public void duties() {
        System.out.println(name + "：收费");
    }
}
