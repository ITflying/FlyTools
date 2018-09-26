package com.hiabby.flytools.gof;

import com.hiabby.flytools.gof.bridge.AnimalBody;
import com.hiabby.flytools.gof.bridge.Soul;
import com.hiabby.flytools.gof.bridge.SoulToReincarnation;
import org.junit.Test;

/**
 * @desc 桥接模式是分离抽象和实现的一种设计模式
 * @date 2018/09/21
 **/
public class BridgeTest {
    @Test
    public void test_bridge() {
        Soul soulToReincarnation = new SoulToReincarnation("猪头", "猪身", "猪腿", new AnimalBody());
        soulToReincarnation.reincarnation();
    }
}
