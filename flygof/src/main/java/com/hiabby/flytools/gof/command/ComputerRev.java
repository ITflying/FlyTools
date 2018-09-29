package com.hiabby.flytools.gof.command;

/**
 * @desc 接收者
 * @date 2018/09/28
 **/
public class ComputerRev {
    private String computName;

    public ComputerRev(String computName) {
        this.computName = computName;
    }

    public void action() {
        System.out.println(computName + "：接收到消息，正在处理");
    }
}
