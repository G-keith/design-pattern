package com.keith.pattern.strategy.ifelse;

/**
 * @author keith
 * @version 1.0
 * @date 2020-06-22
 */
public class EBankStrategy implements Strategy {
    @Override
    public Double callRecharge(Double charge, RechargeTypeEnum typeEnum) {
        return charge * 0.85;
    }
}
