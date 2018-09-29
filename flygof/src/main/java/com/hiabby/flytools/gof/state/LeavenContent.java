package com.hiabby.flytools.gof.state;

/**
 * @desc
 * @date 2018/09/28
 **/
public class LeavenContent {
    // 定义所有状态
    public final static ApplyState APPLY_STATE = new ApplyState();
    public final static LookState LOOK_STATE = new LookState();
    public final static ReviewState REVIEW_STATE = new ReviewState();
    public final static ReplyState REPLY_STATE = new ReplyState();

    private LeaveState leaveState;

    public void setLeaveState(LeaveState leaveState) {
        this.leaveState = leaveState;
        this.leaveState.setContent(this);
    }

    public void apply() {
        this.leaveState.apply();
    }

    public void look() {
        this.leaveState.look();
    }

    public void review() {
        this.leaveState.review();
    }

    public void reply() {
        this.leaveState.reply();
    }
}
