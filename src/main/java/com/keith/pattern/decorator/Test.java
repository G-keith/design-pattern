package com.keith.pattern.decorator;

/**
 * 装饰者模式
 * @author keith
 * @version 1.0
 * @date 2020-06-09
 */
public class Test {

    public static void main(String[] args) {
        Drink drink=new Decaf();
        System.out.println("无因咖啡价格"+drink.getPrice());
        System.out.println("饮料总价"+drink.cost());
        drink=new Milk(drink);
        System.out.println("牛奶价格"+drink.getPrice());
        System.out.println("饮料总价"+drink.cost());
    }

}
