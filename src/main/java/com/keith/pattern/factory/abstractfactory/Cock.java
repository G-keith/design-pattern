package com.keith.pattern.factory.abstractfactory;

import com.keith.pattern.factory.abstractfactory.Animal;

/**
 * @author keith
 * @version 1.0
 * @date 2020-05-21
 **/
public class Cock implements Animal {
    @Override
    public void eat() {
        System.out.println("鸡吃粮食");
    }

    @Override
    public void walk() {
        System.out.println("鸡用两条腿走路");
    }
}
