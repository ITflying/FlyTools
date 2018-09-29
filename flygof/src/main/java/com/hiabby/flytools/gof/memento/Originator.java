package com.hiabby.flytools.gof.memento;

/**
 * @desc Originator 创建并在 Memento 对象中存储状态
 * @date 2018/09/28
 **/
public class Originator {
    public Memento createMemento(int statusCode, String info) {
        return new Memento(statusCode, info);
    }

    public int getStatusCode(Memento memento) {
        return memento.getStatusCode();
    }

    public String getStatusCodeInfo(Memento memento) {
        return memento.getStatusInfo();
    }
}
