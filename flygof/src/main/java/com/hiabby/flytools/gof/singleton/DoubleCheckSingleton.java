package com.hiabby.flytools.gof.singleton;

/**
 * @desc 懒汉式单例模式 - 双重校验，线程安全，效率相对于之前那种有提高
 * @date 2018/09/20
 **/
public class DoubleCheckSingleton {
    private static DoubleCheckSingleton singleton = null;
    private DoubleCheckSingleton(){};
    public static DoubleCheckSingleton getSingleton(){
        if (singleton == null){
            synchronized(DoubleCheckSingleton.class) {
                if (singleton == null) {
                    singleton = new DoubleCheckSingleton();
                }
            }
        }
        return singleton;
    }
}
