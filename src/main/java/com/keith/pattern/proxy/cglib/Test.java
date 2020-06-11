package com.keith.pattern.proxy.cglib;

/**
 * @author keith
 * @version 1.0
 * @date 2020-06-11
 */
public class Test {

    public static void main(String[] args) {
        Grocery grocery=new Grocery();
        GroceryProxy groceryProxy=new GroceryProxy(grocery);
        Grocery proxy=groceryProxy.proxy();
        proxy.sell();
    }
}
