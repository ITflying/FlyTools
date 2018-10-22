package com.hiabby.flytools.gof.visitor;

import java.util.Objects;

/**
 * @desc
 * @date 2018/10/22
 **/
public class CommonEmployee implements IEmployee {
    int count = 0;

    @Override
    public void view(ConsumerBill bill) {
        if (Objects.nonNull(bill)) {
            count++;
            System.out.println("第" + count + "个单子信息，消费内容：" + bill.getProject() + "，消费金额为：" + bill.getMoney());
        }
    }

    @Override
    public void view(IncomeBill bill) {
        if (Objects.nonNull(bill)) {
            count++;
            System.out.println("第" + count + "个单子信息，收入内容：" + bill.getProject() + "，收入金额为：" + bill.getMoney());
        }
    }
}
