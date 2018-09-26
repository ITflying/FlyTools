package com.hiabby.flytools.gof.iterator;

/**
 * @desc
 * @date 2018/09/20
 **/
public interface ITerator {
    void first();

    void next();

    boolean hasNext();

    boolean isFirst();

    boolean isLast();

    Object getCurrentObject();
}
