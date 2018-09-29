package com.hiabby.flytools.gof.state;

/**
 * @desc
 * @date 2018/09/28
 **/
public class LookState extends LeaveState {
    @Override
    public void apply() {
        System.out.println("申请：不在当前状态中");
    }

    @Override
    public void look() {
        System.out.println(" - 提出查看中 -");
    }

    @Override
    public void review() {
        super.content.setLeaveState(LeavenContent.REVIEW_STATE);
        super.content.review();
    }

    @Override
    public void reply() {
        System.out.println("回复：不在当前状态中");
    }
}
