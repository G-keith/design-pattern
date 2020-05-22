package com.keith.pattern.factory.factorymethod;

/**
 * 工厂方法模式
 * @author keith
 * @version 1.0
 * @date 2020-05-21
 **/
public class AnimalFactory {

    /**
     * 多个工厂方法模式-静态工厂方法模式
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
        System.out.println("=================静态工厂方法模式==============");
        Animal dog= AnimalFactory.createDog();
        dog.eat();
        dog.walk();
        Animal cock= AnimalFactory.createCock();
        cock.eat();
        cock.walk();
    }
}