package com.hiabby.flytools.gof;

import com.hiabby.flytools.gof.stragety.PlayStrategy;
import com.hiabby.flytools.gof.stragety.VipOrder;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StragetyTest {

    // region 模式实现
    @Test
    public void test_stragety() {
        int price = 19900;
        VipOrder vipOrder = new VipOrder();
        PlayStrategy playStrategy = new PlayStrategy(vipOrder);
        int discountPrice = playStrategy.getPrice(price);

        System.out.println("原价：" + price + " 折扣价：" + discountPrice);
        assertThat(discountPrice).isEqualTo(17910);
    }

    // endregion
}
