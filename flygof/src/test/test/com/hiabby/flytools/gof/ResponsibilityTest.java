package com.hiabby.flytools.gof;

import com.hiabby.flytools.gof.responsibility.AbstractResponsibility;
import com.hiabby.flytools.gof.responsibility.BossResponsibility;
import com.hiabby.flytools.gof.responsibility.EmployeeResponsibility;
import com.hiabby.flytools.gof.responsibility.ManagerResponsibility;
import org.junit.Test;

/**
 * @desc
 * @date 2018/09/27
 **/
public class ResponsibilityTest {
    @Test
    public void test_responsibility(){
        AbstractResponsibility topResponsibility = getTopResponsibility();

        System.out.println("第一层");
        topResponsibility.handlerMsg(3, "决定是否参加会议");

        System.out.println("第二层");
        topResponsibility.handlerMsg(2, "决定是否参加会议");

        System.out.println("第三层");
        topResponsibility.handlerMsg(1, "决定是否参加会议");
    }

    // region 私有方法

    private AbstractResponsibility getTopResponsibility(){
        AbstractResponsibility bossResponsibility = new BossResponsibility(1);
        AbstractResponsibility managerResponsibility = new ManagerResponsibility(2);
        AbstractResponsibility employeeResponsibility = new EmployeeResponsibility(3);

        bossResponsibility.setNextHandler(managerResponsibility);
        managerResponsibility.setNextHandler(employeeResponsibility);

        return bossResponsibility;
    }
    // endregion
}
