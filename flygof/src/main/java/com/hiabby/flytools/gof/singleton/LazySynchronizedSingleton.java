package com.hiabby.flytools.gof.singleton;

/**
 * @desc 懒汉式单例模式 - 加上同步锁，线程安全，但是效率不高
 * @date 2018/09/20
 **/
public class LazySynchronizedSingleton {
    private static LazySynchronizedSingleton singleton = null;
    private LazySynchronizedSingleton(){};
    public static synchronized LazySynchronizedSingleton getSingleton(){
        if (singleton == null){
            singleton = new LazySynchronizedSingleton();
        }
        return singleton;
    }
}
