package com.hiabby.flytools.gof.factory.AbstractFatory;

public class OrderFactory implements AFactory {
    @Override
    public void executeOpeart() {
        System.out.println("订单操作数据");
    }

    @Override
    public void changeDB() {
        System.out.println("将订单数据写入数据库当中");
    }
}
