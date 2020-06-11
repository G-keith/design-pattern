package com.keith.pattern.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author keith
 * @version 1.0
 * @date 2020-06-11
 */
public class GroceryProxy implements MethodInterceptor {
    private final Grocery grocery;

    public GroceryProxy(Grocery grocery) {
        this.grocery = grocery;
    }

    Grocery proxy() {
        // 创建Enhancer对象
        Enhancer enhancer = new Enhancer();
        // 设置代理的目标类
        enhancer.setSuperclass(Grocery.class);
        // 设置回调方法, this代表是当前类, 因为当前类实现了CallBack
        enhancer.setCallback(this);
        return (Grocery) enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("小卖部进货");
        Object invoke=method.invoke(grocery,objects);
        System.out.println("小卖部退货");
        return invoke;
    }
}
