package com.hiabby.flytools.gof;

import com.hiabby.flytools.gof.decorator.ArmsMagic;
import com.hiabby.flytools.gof.decorator.ChangeMagic;
import com.hiabby.flytools.gof.decorator.Immortal;
import com.hiabby.flytools.gof.decorator.ImmortalMan;
import org.junit.Test;

/**
 * @desc
 * @date 2018/09/21
 **/
public class DecoratorTest {

    @Test
    public void test_decorator(){
        Immortal sunWuKong = new ImmortalMan("孙悟空");
        sunWuKong.showMagicals();
        System.out.println("等级："+sunWuKong.level());

        System.out.println("------------------");
        sunWuKong = new ArmsMagic(sunWuKong, "定海神针");
        sunWuKong.showMagicals();
        System.out.println("\n等级："+sunWuKong.level());

        System.out.println("------------------");
        sunWuKong = new ChangeMagic(sunWuKong, "72变");
        sunWuKong.showMagicals();
        System.out.println("\n等级："+sunWuKong.level());
    }
}
