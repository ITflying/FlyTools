package com.hiabby.flytools.gof.composite.opencomposite;

/**
 * @desc 透明组合模式，在抽象类中定义接口
 * @date 2018/09/25
 **/
public abstract class OpenComponent {
    protected String name;

    public String getName() {
        return name;
    }

    public void print() {
        throw new UnsupportedOperationException();
    }

    public void add(OpenComponent openComponent) {
        throw new UnsupportedOperationException();
    }

    public void remove(OpenComponent openComponent) {
        throw new UnsupportedOperationException();
    }

    public OpenComponent getChild() {
        throw new UnsupportedOperationException();
    }
}
