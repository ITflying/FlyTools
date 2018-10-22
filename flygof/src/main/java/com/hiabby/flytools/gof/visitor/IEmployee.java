package com.hiabby.flytools.gof.visitor;

/**
 * @desc
 * @date 2018/10/22
 **/
public interface IEmployee {
    void view(ConsumerBill bill);

    void view(IncomeBill bill);
}
