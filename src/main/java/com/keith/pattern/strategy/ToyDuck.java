package com.keith.pattern.strategy;

/**
 * @author keith
 * @version 1.0
 * @date 2020-06-22
 */
public class ToyDuck extends Duck{

    public ToyDuck() {
        flyBehavior = new NoFlyBehavior();
    }

    @Override
    public void display() {
        System.out.println("玩具鸭");
    }
}
