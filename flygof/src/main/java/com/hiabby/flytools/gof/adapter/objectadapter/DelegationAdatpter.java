package com.hiabby.flytools.gof.adapter.objectadapter;

import com.hiabby.flytools.gof.adapter.entity.AmericanPowerResource;
import com.hiabby.flytools.gof.adapter.entity.TargetChinaPower;

import java.util.Objects;

/**
 * @desc 利用委派模式来连接需要适配的类
 * @date 2018/09/21
 **/
public class DelegationAdatpter implements TargetChinaPower {
    private AmericanPowerResource americanPowerResource;

    public DelegationAdatpter(AmericanPowerResource powerResource){
        this.americanPowerResource = powerResource;
    }


    @Override
    public int output220v() {
        int chinaOutput = 0;
        if (Objects.nonNull(americanPowerResource)) {
            chinaOutput = americanPowerResource.output() * 2;
        }
        System.out.println("输出：" + chinaOutput + "V");
        return chinaOutput;
    }
}
