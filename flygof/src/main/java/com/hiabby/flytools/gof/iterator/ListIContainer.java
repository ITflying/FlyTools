package com.hiabby.flytools.gof.iterator;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * @desc
 * @date 2018/09/20
 **/
public class ListIContainer implements IContainer {
    public List tList = Lists.newArrayList();


    @Override
    public <T> void setList(List<T> list) {
        tList = list;
    }

    @Override
    public ITerator getITerator() {
        return new NameIterator();
    }

    private class NameIterator implements ITerator {
        int index = 0;

        @Override
        public void first() {
            index = 0;
        }

        @Override
        public void next() {
            index++;
        }

        @Override
        public boolean hasNext() {
            if (index < tList.size()) {
                return true;
            }
            return false;
        }

        @Override
        public boolean isFirst() {
            if (index == 0) {
                return true;
            }
            return false;
        }

        @Override
        public boolean isLast() {
            if (index == (tList.size() - 1)) {
                return true;
            }
            return false;
        }

        @Override
        public Object getCurrentObject() {
            if (this.hasNext()) {
                return tList.get(index++);
            }
            return null;
        }
    }
}
