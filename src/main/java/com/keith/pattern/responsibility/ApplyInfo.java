package com.keith.pattern.responsibility;

/**
 * 申请信息
 * @author keith
 * @version 1.0
 * @date 2020-06-23
 */
public abstract class ApplyInfo {

    int money;

    public abstract void setMoney(int money);

    public abstract int getMoney();

    public void getApply() {
        System.out.println("老大我需要的出差费用是" + getMoney());
    }
}
