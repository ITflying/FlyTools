package com.hiabby.flytools.gof.command;

/**
 * @desc
 * @date 2018/09/28
 **/
public class PowerCommand implements ComputerCommand {
    private String operator;

    public PowerCommand(String operator) {
        this.operator = operator;
    }

    @Override
    public void execute() {
        System.out.println("电脑正在进行" + operator + "操作，请稍等！");
    }
}
