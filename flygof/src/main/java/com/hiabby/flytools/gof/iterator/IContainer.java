package com.hiabby.flytools.gof.iterator;

import java.util.List;

/**
 * @desc
 * @date 2018/09/20
 **/
public interface IContainer {
    <T> void setList(List<T> list);
    ITerator getITerator();
}
