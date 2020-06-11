package com.keith.pattern.proxy.statics;

/**
 * @author keith
 * @version 1.0
 * @date 2020-06-11
 */
public class GroceryProxy implements Procedure{
    private Procedure procedure;

    public GroceryProxy(Procedure procedure) {
        this.procedure = procedure;
    }

    @Override
    public void sell() {
        System.out.println("小卖部进货");
        procedure.sell();
        System.out.println("小卖部退货");
    }
}
