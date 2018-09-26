package com.hiabby.flytools.gof.composite.opencomposite;

/**
 * @desc
 * @date 2018/09/25
 **/
public class OpenDevLeaf extends OpenComponent {

    public OpenDevLeaf(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println(name);
    }
}
