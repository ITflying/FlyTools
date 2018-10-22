package com.hiabby.flytools.gof.visitor;

/**
 * @desc 使用了访问者模式之后，可以让我们在不改变各元素类的前提下定义作用于这些元素的新操作
 * @date 2018/10/22
 **/
public class BossEmployee implements IEmployee {
    private static final String CONSUMER_STR = "消费";
    private static final String INCOME_STR = "收入";
    int totalConsumer = 0;
    int totalIncome = 0;

    @Override
    public void view(ConsumerBill bill) {
        totalConsumer += bill.getMoney();
    }

    @Override
    public void view(IncomeBill bill) {
        totalIncome += bill.getMoney();
    }

    public void getTotalConsumer() {
        System.out.println("老板一共消费了" + totalConsumer);
    }

    public void getTotalIncome() {
        System.out.println("老板一共收入了" + totalIncome);
    }

}
