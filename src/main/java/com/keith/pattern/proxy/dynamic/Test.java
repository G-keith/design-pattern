package com.keith.pattern.proxy.dynamic;

/**
 * @author keith
 * @version 1.0
 * @date 2020-06-11
 */
public class Test {

    public static void main(String[] args) {
        GroceryProxy groceryProxy = new GroceryProxy();
        groceryProxy.sell();
    }
}
