package com.hiabby.flytools.gof.observer;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * @desc
 * @date 2018/09/20
 **/
public class AdminOba implements Observable {
    private final String name = "行政部";
    private List<Observer> peopleList = Lists.newArrayList();
    private String message = null;

    @Override
    public void register(Observer observer) {
        peopleList.add(observer);
    }

    @Override
    public void removeRegister(Observer observer) {
        peopleList.remove(observer);
    }

    @Override
    public void setNoticeContent(String message) {
        this.message = name + "发送公告【" + message + "】";
    }

    @Override
    public void noticeEverybody() {
        peopleList.forEach(x -> {
            x.notice(this.message);
        });
    }

}
