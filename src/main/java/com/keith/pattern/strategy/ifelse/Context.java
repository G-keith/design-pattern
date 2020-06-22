package com.keith.pattern.strategy.ifelse;

/**
 * @author keith
 * @version 1.0
 * @date 2020-06-22
 */
public class Context {

    private Strategy strategy;

    public Double callRecharge(Double charge,RechargeTypeEnum typeEnum){
        strategy=StrategyFactory.getInstance().creator(typeEnum.getValue());
        return strategy.callRecharge(charge,typeEnum);
    }

    public Strategy getStrategy() {
        return strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
}
