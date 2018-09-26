package com.hiabby.flytools.gof.singleton;

/**
 * @desc 静态内部类
 * @date 2018/09/20
 **/
public class HolderSingleton {
    private static HolderSingleton singleton = null;

    private HolderSingleton() {
    }

    public static HolderSingleton getSingleton() {
        return singletonHolder.singleton;
    }

    ;

    private static class singletonHolder {
        private static HolderSingleton singleton = new HolderSingleton();
    }
}
