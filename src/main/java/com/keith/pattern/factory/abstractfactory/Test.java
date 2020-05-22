package com.keith.pattern.factory.abstractfactory;

/**
 * @author keith
 * @version 1.0
 * @date 2020-05-22
 **/
public class Test {

    public static void main(String[] args) {
        Factory factory = new DogFactory();
        Animal animal = factory.produce();
        Like like=factory.like();
        animal.eat();
        animal.walk();
        like.like();

    }
}
