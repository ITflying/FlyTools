package com.hiabby.flytools.gof.decorator;

/**
 * @desc 装饰器模式 - 第一层：需要装饰的抽象对戏那个，component 第二层：具体组件（对象那个），抽象装饰类 第三层具体装饰类
 * @date 2018/09/21
 **/
public interface Immortal {
    int level();
    void addMagic(String magicName);
    void showMagicals();
}
