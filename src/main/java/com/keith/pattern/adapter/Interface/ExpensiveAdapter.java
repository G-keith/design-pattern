package com.keith.pattern.adapter.Interface;

/**
 * 接口适配器,适用于不想重写接口里面所有方法
 * @author keith
 * @version 1.0
 * @date 2020-06-04
 */
public class ExpensiveAdapter extends Adapter {
    @Override
    public void action() {
        System.out.println("action");
    }
    @Override
    public void action2() {
        System.out.println("action2");
    }
}
