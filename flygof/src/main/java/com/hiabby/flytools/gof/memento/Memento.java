package com.hiabby.flytools.gof.memento;

/**
 * @desc Memento 包含了要被恢复的对象的状态
 * @date 2018/09/28
 **/
public class Memento {
    private int statusCode;
    private String info;

    public Memento(int statusCode, String info) {
        this.statusCode = statusCode;
        this.info = info;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public String getStatusInfo() {
        return info;
    }
}
