package com.keith.pattern.strategy.ifelse;

/**
 * @author keith
 * @version 1.0
 * @date 2020-06-22
 */
public interface Strategy {

    public Double callRecharge(Double charge,RechargeTypeEnum typeEnum);
}
