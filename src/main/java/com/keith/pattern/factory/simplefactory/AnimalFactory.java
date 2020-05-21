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

    /**
     * 多个工厂模式-静态工厂方法模式
     */
    public static Animal createDog(){
        return new Dog();
    }

    public static Animal createCock(){
        return new Cock();
    }
}

class Test{
    public static void main(String[] args) {

        Animal animal = AnimalFactory.createAnimal(AnimalFactory.DOG);
        animal.eat();
        animal.walk();
        System.out.println("=================静态工厂方法模式==============");
        Animal dog=AnimalFactory.createDog();
        dog.eat();
        dog.walk();
        Animal cock=AnimalFactory.createCock();
        cock.eat();
        cock.walk();
    }
}