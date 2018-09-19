package com.hiabby.flytools.gof.stragety;

public class PlayStrategy {
    private Order order;

    public PlayStrategy(Order order) {
        this.order = order;
    }

    /**
     * 获取价格
     *
     * @param price
     * @return
     */
    public int getPrice(int price) {
        return order.discount(price);
    }
}
