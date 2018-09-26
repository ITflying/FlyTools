package com.hiabby.flytools.gof.prototype;

/**
 * @desc 原型模式
 * @date 2018/09/21
 **/
public abstract class GameUserPrototype implements Cloneable {
    protected String model;
    private String name;

    abstract void createUser();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public Object clone() {
        Object gameUser = null;
        try {
            gameUser = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return gameUser;
    }
}
