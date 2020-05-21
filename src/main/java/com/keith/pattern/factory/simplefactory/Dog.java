package com.keith.pattern.factory.simplefactory;

/**
 * @author keith
 * @version 1.0
 * @date 2020-05-21
 **/
public class Dog implements Animal{
    @Override
    public void eat() {
        System.out.println("狗吃骨头");
    }

    @Override
    public void walk() {
        System.out.println("狗用四条腿走路");
    }
}
