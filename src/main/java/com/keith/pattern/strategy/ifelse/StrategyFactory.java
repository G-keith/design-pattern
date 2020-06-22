package com.keith.pattern.strategy.ifelse;

import java.util.HashMap;
import java.util.Map;

/**
 * 策略模式结合单例模式
 *
 * @author keith
 * @version 1.0
 * @date 2020-06-22
 */
public class StrategyFactory {
    private static final StrategyFactory strategyFactory = new StrategyFactory();

    private StrategyFactory() {
    }

    private static final Map<Integer, Strategy> strategyMap = new HashMap<>();

    /*
     * 静态代码块初始化Strategy
     */
    static {
        strategyMap.put(RechargeTypeEnum.E_BANK.getValue(), new EBankStrategy());
        strategyMap.put(RechargeTypeEnum.MOBILE.getValue(), new MobileStrategy());
    }

    public static StrategyFactory getInstance() {
        return strategyFactory;
    }

    public Strategy creator(Integer type) {
        return strategyMap.get(type);
    }
}
