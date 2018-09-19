package com.hiabby.flytools.gof.stragety;

public class VipOrder implements Order {

    @Override
    public int discount(int price) {
        System.out.println("vip为九折优惠");
        int result = (int) (price * 0.9);
        return result;
    }
}
