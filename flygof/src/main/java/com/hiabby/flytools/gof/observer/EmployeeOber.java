package com.hiabby.flytools.gof.observer;

/**
 * @desc
 * @date 2018/09/20
 **/
public class EmployeeOber implements Observer {
    private final String name = "员工组";

    @Override
    public void notice(String message) {
        System.out.println(name + "接收到公告，公告内容为：" + message);
    }
}
