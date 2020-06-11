package com.keith.pattern.proxy.statics;

/**
 * @author keith
 * @version 1.0
 * @date 2020-06-11
 */
public class Test {

    public static void main(String[] args) {
        Procedure procedure=new Grocery();
        GroceryProxy groceryProxy=new GroceryProxy(procedure);
        groceryProxy.sell();
    }
}
