package com.hiabby.flytools.gof.composite.safecomposite;

/**
 * @desc
 * @date 2018/09/26
 **/
public class SafeCompositeLeaf extends SafeComponent{

    public SafeCompositeLeaf(String name){
        super(name);
    }

    @Override
    public void show(int depth) {
        System.out.println(name);
    }
}
