package com.hiabby.flytools.gof.singleton;

/**
 * @desc 饿汉式单例模式 - 一开始就初始化
 * @date 2018/09/20
 **/
public class HungrySingleton {
    private static HungrySingleton singleton = new HungrySingleton();
    private HungrySingleton(){};
    public static HungrySingleton getSingleton(){
        return singleton;
    }

    /*
     * 以下为另一种方式
     * private static HungrySingleton singleton = null;
     * static{
     *  singleton = new HungrySingleton();
     *  }
     *  public static HungrySingleton getSingleton(){
     *    return singleton;
     *  }
     */
}
