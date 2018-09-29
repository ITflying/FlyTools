package com.hiabby.flytools.gof.state;

/**
 * @desc
 * @date 2018/09/28
 **/
public class ReplyState extends LeaveState {
    @Override
    public void apply() {
        super.content.setLeaveState(LeavenContent.APPLY_STATE);
        super.content.apply();
    }

    @Override
    public void look() {
        System.out.println("查看：不在当前状态中");
    }

    @Override
    public void review() {
        System.out.println("审核：不在当前状态中");
    }

    @Override
    public void reply() {
        System.out.println(" - 最终给出回复 -");
    }
}
