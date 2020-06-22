package com.keith.pattern.strategy.ifelse;

/**
 * @author keith
 * @version 1.0
 * @date 2020-06-22
 */
public enum RechargeTypeEnum {

    /**
     * 话费充值类型
     */
    E_BANK(1,"网银充值"),
    MOBILE(2,"手机充值");

    private final int value;

    private final String desc;

    RechargeTypeEnum(int value, String desc) {
        this.value = value;
        this.desc = desc;
    }

    public int getValue() {
        return value;
    }

    public String getDesc() {
        return desc;
    }
}
