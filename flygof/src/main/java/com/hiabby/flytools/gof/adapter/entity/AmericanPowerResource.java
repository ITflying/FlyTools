package com.hiabby.flytools.gof.adapter.entity;

/**
 * @desc
 * @date 2018/09/21
 **/
public class AmericanPowerResource {
    int power = 110;

    public int output(){
        System.out.println("输出：" + power + "V");
        return 110;
    }
}
