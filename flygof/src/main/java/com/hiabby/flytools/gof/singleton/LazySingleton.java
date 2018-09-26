package com.hiabby.flytools.gof.singleton;

/**
 * @desc 懒汉式单例模式 - 延迟加载，线程不安全
 * @date 2018/09/20
 **/
public class LazySingleton {
    private static LazySingleton singleton = null;

    private LazySingleton() {
    }

    ;

    public static LazySingleton getSingleton() {
        if (singleton == null) {
            singleton = new LazySingleton();
        }
        return singleton;
    }
}
