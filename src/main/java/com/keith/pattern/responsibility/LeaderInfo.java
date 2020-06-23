package com.keith.pattern.responsibility;

/**
 * @author keith
 * @version 1.0
 * @date 2020-06-23
 */
public abstract class LeaderInfo {

    /**
     * 当前领导审核的金额
     */
    int auditMoney;

    /**
     * 当前领导的上级领导
     */
    LeaderInfo superiorLeader;

    /**
     * 设置当前领导能审批的额度
     */
    public abstract void setCurrentMoney(int money);

    //当前领导收到申请后处理的事情
    public abstract void handler(ApplyInfo applyInfo);

    //设置当前领导的上一级领导
    public abstract void setSuperiorLeader(LeaderInfo superiorLeader);

    //执行审批流程
    public void dealInfo(ApplyInfo applyInfo) {
        if (applyInfo.money <= auditMoney) {
            handler(applyInfo);
        } else {
            superiorLeader.dealInfo(applyInfo);
        }
    }
}
