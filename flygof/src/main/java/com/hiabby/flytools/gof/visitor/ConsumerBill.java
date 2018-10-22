package com.hiabby.flytools.gof.visitor;

/**
 * @desc
 * @date 2018/10/22
 **/
public class ConsumerBill implements IBill {
    private String project;
    private int money;

    public ConsumerBill(String project, int money) {
        this.project = project;
        this.money = money;
    }


    public String getProject() {
        return project;
    }

    public int getMoney() {
        return money;
    }

    @Override
    public void accept(IEmployee iEmployee) {
        iEmployee.view(this);
    }
}
