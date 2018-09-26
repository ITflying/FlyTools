package com.hiabby.flytools.gof.composite.safecomposite;

/**
 * @desc 安全组合模式，将定义都封装在实现类当中
 * @date 2018/09/25
 **/
public abstract class SafeComponent {
    protected String name;

    public SafeComponent(String name) {
        this.name = name;
    }

    public abstract void show(int depth);

}
