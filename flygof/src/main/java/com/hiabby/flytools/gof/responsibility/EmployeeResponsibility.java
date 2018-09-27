package com.hiabby.flytools.gof.responsibility;

/**
 * @desc
 * @date 2018/09/27
 **/
public class EmployeeResponsibility extends AbstractResponsibility{
    public EmployeeResponsibility(int level){
        super(level);
    }

    @Override
    public void decide(String msg) {
        System.out.println("相关员工拍板决定了");
    }
}
