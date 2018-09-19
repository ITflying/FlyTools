package com.hiabby.flytools.gof.factory.AbstractFatory;

public class ReceivedFactory implements AFactory {
    @Override
    public void executeOpeart() {
        System.out.println("入库单操作数据");
    }

    @Override
    public void changeDB() {
        System.out.println("将入库单数据写入数据库当中");
    }
}
