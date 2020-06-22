package com.keith.pattern.strategy;

/**
 * @author keith
 * @version 1.0
 * @date 2020-06-22
 */
public abstract class Duck {


    /**
     * 属性, 策略接口
     */
    FlyBehavior flyBehavior;
    public Duck() {}

    /**
     * 显示鸭子信息
     */
    public abstract void display();
    public void fly() {
        if(flyBehavior != null) {
            flyBehavior.fly();
        }
    }

    public FlyBehavior getFlyBehavior() {
        return flyBehavior;
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

}
