package com.hiabby.flytools.gof.adapter.classadapter;

import com.hiabby.flytools.gof.adapter.entity.TargetChinaPower;
import com.hiabby.flytools.gof.adapter.entity.AmericanPowerResource;

/**
 * @desc
 * @date 2018/09/21
 **/
public class PowerResourceAdapter extends AmericanPowerResource implements TargetChinaPower {

    @Override
    public int output220v() {
        int amOutput = super.output();
        int chinaOutput = amOutput * 2;
        System.out.println("输出：" + chinaOutput + "V");
        return chinaOutput;
    }
}
