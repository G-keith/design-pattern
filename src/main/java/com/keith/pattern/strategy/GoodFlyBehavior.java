package com.keith.pattern.strategy;

/**
 * @author keith
 * @version 1.0
 * @date 2020-06-22
 */
public class GoodFlyBehavior implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("会飞");
    }
}
