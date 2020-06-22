package com.keith.pattern.strategy;

/**
 * @author keith
 * @version 1.0
 * @date 2020-06-22
 */
public class PekingDuck extends Duck{

    public PekingDuck() {
        flyBehavior = new GoodFlyBehavior();
    }

    @Override
    public void display() {
        System.out.println("~~北京鸭~~~");
    }
}
