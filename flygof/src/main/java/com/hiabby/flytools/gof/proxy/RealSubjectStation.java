package com.hiabby.flytools.gof.proxy;

/**
 * @desc
 * @date 2018/09/21
 **/
public class RealSubjectStation implements Subject {
    int price = 16;

    @Override
    public int buyTrainticket(int money) {
        money = money - 16;
        System.out.println("火车站：购买一张火车票，找零:"+money+"元");
        return money;
    }
}
