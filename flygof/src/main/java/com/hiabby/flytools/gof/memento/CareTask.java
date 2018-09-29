package com.hiabby.flytools.gof.memento;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * @desc 回复状态
 * @date 2018/09/28
 **/
public class CareTask {
    private List<Memento> mementos = Lists.newArrayList();

    public void add(Memento memento) {
        mementos.add(memento);
    }

    public Memento reback(int num) {
        return mementos.get(num);
    }
}
