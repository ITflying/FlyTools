package com.hiabby.flytools.gof.observer;

/**
 * @desc
 * @date 2018/09/20
 **/
public interface Observable {
    void register(Observer observer);

    void removeRegister(Observer observer);

    void setNoticeContent(String message);

    void noticeEverybody();
}
