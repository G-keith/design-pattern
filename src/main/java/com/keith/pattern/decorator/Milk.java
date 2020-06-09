package com.keith.pattern.decorator;

/**
 * 咖啡调料-牛奶
 * @author keith
 * @version 1.0
 * @date 2020-06-09
 */
public class Milk extends Decorator{
    public Milk(Drink drink){
        super(drink);
        setPrice(0.1f);
        setType("牛奶");
    }
}
