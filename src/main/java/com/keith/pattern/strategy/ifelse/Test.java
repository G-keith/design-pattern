package com.keith.pattern.strategy.ifelse;

/**
 * 策略模式解决if/else
 * @author keith
 * @version 1.0
 * @date 2020-06-22
 */
public class Test {

    public static void main(String[] args) {
        Context context=new Context();
        Double money=context.callRecharge(1000.00,RechargeTypeEnum.E_BANK);
        System.out.println(money);

        Double money2=context.callRecharge(1000.00,RechargeTypeEnum.MOBILE);
        System.out.println(money2);
    }
}
