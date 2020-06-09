package com.keith.pattern.decorator;

/**
 * 咖啡类
 * @author keith
 * @version 1.0
 * @date 2020-06-09
 */
public class Coffee extends Drink{
    @Override
    public float cost() {
        return getPrice();
    }
}
