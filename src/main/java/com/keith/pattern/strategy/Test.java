package com.keith.pattern.strategy;

/**
 * @author keith
 * @version 1.0
 * @date 2020-06-22
 */
public class Test {

    public static void main(String[] args) {
        ToyDuck toyDuck = new ToyDuck();
        toyDuck.display();
        toyDuck.fly();
        PekingDuck pekingDuck = new PekingDuck();
        pekingDuck.display();
        pekingDuck.fly();
        //动态改变某个对象的行为, 北京鸭 不能飞
        pekingDuck.setFlyBehavior(new NoFlyBehavior());
        pekingDuck.display();
        pekingDuck.fly();
    }
}
