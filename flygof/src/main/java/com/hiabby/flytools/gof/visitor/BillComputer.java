package com.hiabby.flytools.gof.visitor;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * @desc
 * @date 2018/10/22
 **/
public class BillComputer {
    private List<IBill> billList = Lists.newArrayList();

    public void add(IBill bill) {
        billList.add(bill);
    }

    public void show(IEmployee employee) {
        billList.forEach(bill -> {
            bill.accept(employee);
        });
    }
}
