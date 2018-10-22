package com.hiabby.flytools.gof.visitor;

/**
 * q * @desc
 *
 * @date 2018/10/22
 **/
public class IncomeBill implements IBill {
    private String project;
    private int money;

    public IncomeBill(String project, int money) {
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
