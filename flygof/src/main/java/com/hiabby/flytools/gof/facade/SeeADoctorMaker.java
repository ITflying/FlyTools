package com.hiabby.flytools.gof.facade;

/**
 * @desc
 * @date 2018/09/21
 **/
public class SeeADoctorMaker {
    private FrontDesk frontDesk;
    private TollBooth tollBooth;
    private OutpatientDepartment od;

    public SeeADoctorMaker() {
        frontDesk = new FrontDesk();
        tollBooth = new TollBooth();
        od = new OutpatientDepartment();
    }

    public void watchingSomethingError() {
        frontDesk.duties();
        tollBooth.duties();
        od.duties();
    }
}
