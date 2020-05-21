package com.keith.pattern.factory.simplefactory;

/**
 * 简单工厂模式
 * @author keith
 * @version 1.0
 * @date 2020-05-21
 **/
public class AnimalFactory {

    public static final int DOG = 1;
    public static final int COCK = 2;

    public static Animal createAnimal(int type) {
        switch (type) {
            case DOG:
                return new Dog();
            case COCK:
            default:
                return new Cock();
        }
    }

}

class Test{
    public static void main(String[] args) {

        Animal animal = AnimalFactory.createAnimal(AnimalFactory.DOG);
        animal.eat();
        animal.walk();
    }
}