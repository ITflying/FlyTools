package com.hiabby.flytools.gof.stragety;


public class CommonOrder implements Order {

    @Override
    public int discount(int price) {
        System.out.println("普通会员原价");
        return price;
    }
}
