package com.hiabby.flytools.gof.bridge;

/**
 * @desc
 * @date 2018/09/21
 **/
public class AnimalBody implements Body {
    @Override
    public void reincarnation(String head, String body, String leg) {
        System.out.println("转世为动物，身体结构为：");
        System.out.println(head);
        System.out.println(body);
        System.out.println(leg);
    }
}
