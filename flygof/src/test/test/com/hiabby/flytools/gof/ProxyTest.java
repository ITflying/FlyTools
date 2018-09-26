package com.hiabby.flytools.gof;

import com.hiabby.flytools.gof.proxy.ProxySaleStation;
import org.junit.Test;

/**
 * @desc
 * @date 2018/09/21
 **/
public class ProxyTest {

    @Test
    public void test_proxy() {
        int money = 153;
        ProxySaleStation station = new ProxySaleStation();
        station.buyTrainticket(money);
    }
}
