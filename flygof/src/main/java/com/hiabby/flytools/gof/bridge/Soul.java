package com.hiabby.flytools.gof.bridge;

/**
 * @desc
 * @date 2018/09/21
 **/
public abstract class Soul {
    protected Body bodyApi;

    protected Soul(Body bodyApi){
        this.bodyApi = bodyApi;
    }

    public abstract void reincarnation();
}
