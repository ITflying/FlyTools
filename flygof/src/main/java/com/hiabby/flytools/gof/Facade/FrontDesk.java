package com.hiabby.flytools.gof.Facade;

/**
 * @desc
 * @date 2018/09/21
 **/
public class FrontDesk implements Hospital{
    private String name = "前台";
    @Override
    public void duties() {
        System.out.println(name + "：挂号");
    }
}
