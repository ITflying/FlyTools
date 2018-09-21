package com.hiabby.flytools.gof.proxy;

/**
 * @desc
 * @date 2018/09/21
 **/
public class ProxySaleStation implements Subject{
    private int fee = 5;

    @Override
    public int buyTrainticket(int money) {
        RealSubjectStation realSubjectStation = new RealSubjectStation();
        money = realSubjectStation.buyTrainticket(money);
        money = this.getFee(money);
        System.out.println("代售点：欢迎来到代售点购买火车票，找零:"+money+"元");
        return money;
    }

    public int getFee(int money){
        System.out.println("代售点：收取"+fee+"元手续费");
        return (money - 5);
    }
}
