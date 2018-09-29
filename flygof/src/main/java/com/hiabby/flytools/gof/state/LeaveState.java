package com.hiabby.flytools.gof.state;

/**
 * @desc
 * @date 2018/09/28
 **/
public abstract class LeaveState {
    protected LeavenContent content;

    public void setContent(LeavenContent content) {
        this.content = content;
    }

    public abstract void apply();

    public abstract void look();

    public abstract void review();

    public abstract void reply();
}
