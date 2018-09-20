package com.hiabby.flytools.gof;

import com.hiabby.flytools.gof.observer.AdminOba;
import com.hiabby.flytools.gof.observer.EmployeeOber;
import com.hiabby.flytools.gof.observer.ProgrammerOber;
import org.junit.Test;

/**
 * @desc
 * @date 2018/09/20
 **/
public class ObserverTest {
    @Test
    public void test_observer(){
        AdminOba adminOba = new AdminOba();

        EmployeeOber employeeOber = new EmployeeOber();
        ProgrammerOber programmerOber = new ProgrammerOber();

        // 注册监听者
        adminOba.register(employeeOber);
        adminOba.register(programmerOber);

        // 发送消息
        adminOba.setNoticeContent("中秋节放假通知");
        System.out.println("中秋节放假通知：");
        adminOba.noticeEverybody();

        // 注销监听者
        adminOba.removeRegister(employeeOber);
        adminOba.setNoticeContent("中秋节加班通知");
        System.out.println("\n中秋节加班通知：");
        adminOba.noticeEverybody();
    }
}
