package com.hiabby.flytools.gof;

import com.hiabby.flytools.gof.state.LeavenContent;
import org.junit.Test;

/**
 * @desc
 * @date 2018/09/28
 **/
public class StateTest {
    @Test
    public void test_state() {
        LeavenContent content = new LeavenContent();
        content.setLeaveState(LeavenContent.APPLY_STATE);

        System.out.println("------ 正常流程 -------");
        content.apply();
        content.look();
        content.review();
        content.reply();

        System.out.println("\n------ 非正常流程 -------");
        content.review();
    }
}
