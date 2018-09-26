package com.hiabby.flytools.gof.bridge;

/**
 * @desc
 * @date 2018/09/21
 **/
public class SoulToReincarnation extends Soul {
    private String head;
    private String body;
    private String leg;

    public SoulToReincarnation(String head, String body, String leg, Body bodyApi) {
        super(bodyApi);
        this.head = head;
        this.body = body;
        this.leg = leg;
    }

    @Override
    public void reincarnation() {
        bodyApi.reincarnation(head, body, leg);
    }
}
