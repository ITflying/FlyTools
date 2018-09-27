package com.hiabby.flytools.gof.responsibility;

/**
 * @desc
 * @date 2018/09/27
 **/
public class ManagerResponsibility extends AbstractResponsibility{
    public ManagerResponsibility(int level){
        super(level);
    }

    @Override
    public void decide(String msg) {
        System.out.println("管理人员拍板决定了");
    }
}
