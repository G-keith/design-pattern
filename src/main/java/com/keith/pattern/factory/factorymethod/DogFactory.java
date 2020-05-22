package com.keith.pattern.factory.factorymethod;

/**
 * @author keith
 * @version 1.0
 * @date 2020-05-22
 **/
public class DogFactory implements Provider {
    @Override
    public Animal produce() {
        return new Dog();
    }
}
