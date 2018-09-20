package com.hiabby.flytools.gof;

import com.google.common.collect.Lists;
import com.hiabby.flytools.gof.iterator.ITerator;
import com.hiabby.flytools.gof.iterator.ListIContainer;
import org.junit.Test;

import java.util.List;

/**
 * @desc
 * @date 2018/09/20
 **/
public class IteratorTest {

    @Test
    public void test_name_iterator(){
        ListIContainer listIContainer = new ListIContainer();
        List<String> nameList = Lists.newArrayList();
        nameList.add("jack");
        nameList.add("dike");
        nameList.add("rose");

        listIContainer.setList(nameList);
        for (ITerator iTerator = listIContainer.getITerator(); iTerator.hasNext(); ){
            String name = (String)iTerator.getCurrentObject();
            System.out.println("Name : " + name);
        }
    }
}
