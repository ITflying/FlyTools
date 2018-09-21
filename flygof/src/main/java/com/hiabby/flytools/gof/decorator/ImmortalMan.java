package com.hiabby.flytools.gof.decorator;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @desc 对象
 * @date 2018/09/21
 **/
public class ImmortalMan implements Immortal{
    private String name;
    private int level;
    private List<String> magic;

    public ImmortalMan(String name){
        this.level = 1;
        this.name = name;
        this.magic = new ArrayList<>();
    }

    @Override
    public int level() {
        return level;
    }

    @Override
    public void addMagic(String magicName){
        // 因为会多次初始化数据，所以要过滤
        if (!magic.contains(magicName)) {
            magic.add(magicName);
        }
    }

    @Override
    public void showMagicals() {
        if (CollectionUtils.isEmpty(magic)){
            System.out.println(name + "：没有任何神通！");
            return;
        }
        System.out.print(name + "神通：");
        magic.forEach(x -> {
            System.out.print(x + " ");
        });
    }
}
