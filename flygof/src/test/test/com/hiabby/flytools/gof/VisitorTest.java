package com.hiabby.flytools.gof;

import com.hiabby.flytools.gof.visitor.*;
import org.junit.Test;

/**
 * @desc 访问者模式测试用例
 * @date 2018/10/22
 **/
public class VisitorTest {
    @Test
    public void test_visitor() {
        // 账单列表
        IBill consumerBill1 = new ConsumerBill("消费1", 100);
        IBill consumerBill2 = new ConsumerBill("消费2", 200);
        IBill incomeBill1 = new IncomeBill("收入1", 3000);
        IBill incomeBill2 = new IncomeBill("收入2", 4000);

        // 账单控制
        BillComputer billComputer = new BillComputer();
        billComputer.add(consumerBill1);
        billComputer.add(consumerBill2);
        billComputer.add(incomeBill1);
        billComputer.add(incomeBill2);

        // 访问者
        BossEmployee bossEmployee = new BossEmployee();
        CommonEmployee commonEmployee = new CommonEmployee();

        billComputer.show(bossEmployee);
        billComputer.show(commonEmployee);

        bossEmployee.getTotalConsumer();
        bossEmployee.getTotalIncome();
    }
}
