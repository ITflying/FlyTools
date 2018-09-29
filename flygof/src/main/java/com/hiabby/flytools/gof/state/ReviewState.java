package com.hiabby.flytools.gof.state;

/**
 * @desc
 * @date 2018/09/28
 **/
public class ReviewState extends LeaveState {
    @Override
    public void apply() {
        System.out.println("申请：不在当前状态中");
    }

    @Override
    public void look() {
        System.out.println("查看：不在当前状态中");
    }

    @Override
    public void review() {
        System.out.println(" - 提出审核中 -");
    }

    @Override
    public void reply() {
        super.content.setLeaveState(LeavenContent.REPLY_STATE);
        super.content.reply();
    }
}
