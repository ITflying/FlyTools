package com.hiabby.flytools.gof.responsibility;

import java.util.Objects;

/**
 * @desc 责任链模式
 * @date 2018/09/27
 **/
public abstract class AbstractResponsibility {
    private AbstractResponsibility nextHandler;
    private int level;

    public AbstractResponsibility(int level) {
        this.level = level;
    }

    public void setNextHandler(AbstractResponsibility nextHandler) {
        this.nextHandler = nextHandler;
    }

    public void handlerMsg(int level, String msg) {
        if (this.level == level) {
            this.decide(msg);
        } else {
            if (Objects.isNull(this.nextHandler)){
                System.out.println("决定金字塔顶：只能在这里解决了");
            }else {
                this.nextHandler.handlerMsg(level, msg);
            }
        }
    }

    public abstract void decide(String msg);
}
