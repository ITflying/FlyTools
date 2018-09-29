package com.hiabby.flytools.gof.state;

/**
 * @desc
 * @date 2018/09/28
 **/
public class ApplyState extends LeaveState {
    @Override
    public void apply() {
        System.out.println(" - 提出申请中 -");
    }

    @Override
    public void look() {
        super.content.setLeaveState(LeavenContent.LOOK_STATE);
        super.content.look();
    }

    @Override
    public void review() {
        System.out.println("审核：不在当前状态中");
    }

    @Override
    public void reply() {
        System.out.println("回复：不在当前状态中");
    }
}
