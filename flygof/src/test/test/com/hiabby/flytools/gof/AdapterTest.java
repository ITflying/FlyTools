package com.hiabby.flytools.gof;

import com.hiabby.flytools.gof.adapter.classadapter.PowerResourceAdapter;
import com.hiabby.flytools.gof.adapter.entity.AmericanPowerResource;
import com.hiabby.flytools.gof.adapter.entity.TargetChinaPower;
import com.hiabby.flytools.gof.adapter.interfaceadapter.MediaOfMp3;
import com.hiabby.flytools.gof.adapter.interfaceadapter.MediaOfMp4;
import com.hiabby.flytools.gof.adapter.objectadapter.DelegationAdatpter;
import org.junit.Test;

/**
 * @desc 适配器模式的测试用例
 * @date 2018/09/21
 **/
public class AdapterTest {

    @Test
    public void test_class_adapter(){
        TargetChinaPower power = new PowerResourceAdapter();
        power.output220v();
    }

    @Test
    public void test_interface_adapter(){
        MediaOfMp3 mp3 = new MediaOfMp3();
        mp3.playMp3();
        mp3.playMusic();

        MediaOfMp4 mp4 = new MediaOfMp4();
        mp4.playMovie();
        mp4.playMp3();
        mp4.playMusic();
        mp4.playMp4();
    }

    @Test
    public void test_object_adapter(){
        DelegationAdatpter power = new DelegationAdatpter(new AmericanPowerResource());
        power.output220v();
    }
}
