package com.hiabby.flytools.gof;

import com.hiabby.flytools.gof.Facade.SeeADoctorMaker;
import org.junit.Test;

/**
 * @desc
 * @date 2018/09/21
 **/
public class FacadeTest {
    @Test
    public void test_facade(){
        SeeADoctorMaker seeADoctorMaker = new SeeADoctorMaker();
        seeADoctorMaker.watchingSomethingError();
    }
}
