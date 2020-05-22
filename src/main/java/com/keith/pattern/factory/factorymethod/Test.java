package com.keith.pattern.factory.factorymethod;

/**
 * @author keith
 * @version 1.0
 * @date 2020-05-22
 **/
public class Test {

    public static void main(String[] args) {
        Provider provider = new DogFactory();
        Animal animal = provider.produce();
        animal.eat();
        animal.walk();
    }
}
