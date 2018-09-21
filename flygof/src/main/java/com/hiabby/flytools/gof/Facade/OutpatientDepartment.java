package com.hiabby.flytools.gof.Facade;

/**
 * @desc
 * @date 2018/09/21
 **/
public class OutpatientDepartment implements Hospital{
    private String name = "门诊部";
    @Override
    public void duties() {
        System.out.println(name + "：看病");
    }
}
