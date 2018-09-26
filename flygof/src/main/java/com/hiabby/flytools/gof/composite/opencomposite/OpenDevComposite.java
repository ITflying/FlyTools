package com.hiabby.flytools.gof.composite.opencomposite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @desc
 * @date 2018/09/25
 **/
public class OpenDevComposite extends OpenComponent{
    private List<OpenComponent> openComponentList = new ArrayList<>();

    public OpenDevComposite(String name){
        this.name = name;
    }

    @Override
    public void print(){
        System.out.println(name);

        Iterator<OpenComponent> iterator = openComponentList.iterator();
        while (iterator.hasNext()){
            OpenComponent temp = iterator.next();
            System.out.print("\t\t");
            temp.print();
        }
    }

    @Override
    public void add(OpenComponent openComponent){
        openComponentList.add(openComponent);
    }

    @Override
    public void remove(OpenComponent openComponent){
        openComponentList.remove(openComponent);
    }

    @Override
    public OpenComponent getChild(){
        throw new UnsupportedOperationException();
    }
}
