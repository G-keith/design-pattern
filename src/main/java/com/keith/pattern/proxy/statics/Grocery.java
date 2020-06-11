package com.keith.pattern.proxy.statics;

/**
 * 杂货店
 * @author keith
 * @version 1.0
 * @date 2020-06-11
 */
public class Grocery implements Procedure{
    @Override
    public void sell() {
        System.out.println("杂货店售卖产品");
    }
}
