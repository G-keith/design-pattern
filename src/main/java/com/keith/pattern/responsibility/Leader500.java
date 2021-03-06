package com.keith.pattern.responsibility;

/**
 * @author keith
 * @version 1.0
 * @date 2020-06-23
 */
public class Leader500 extends LeaderInfo{
    @Override
    public void setCurrentMoney(int money) {
        super.auditMoney = money;
    }

    @Override
    public void handler(ApplyInfo applyInfo) {
        applyInfo.getApply();
        System.out.print("     我是Leader500  你需要申请的" + applyInfo.getMoney() + "我批准了");
    }

    @Override
    public void setSuperiorLeader(LeaderInfo superiorLeader) {
        super.superiorLeader = superiorLeader;
    }
}
