package com.keith.pattern.proxy.dynamic;

import java.lang.reflect.Proxy;

/**
 * @author keith
 * @version 1.0
 * @date 2020-06-11
 */
public class GroceryProxy{

    public void sell() {
        Procedure producer2 = new Grocery();
        Procedure producerProxy = (Procedure) Proxy.newProxyInstance(producer2.getClass().getClassLoader(),
                producer2.getClass().getInterfaces(), (proxy, method, args1) -> {
                    System.out.println("----------小卖部卖货前--------");
                    Object invoke = method.invoke(producer2,args1);
                    System.out.println("----------小卖部卖货后--------");
                    return invoke;
                });
        producerProxy.sell();
    }
}
