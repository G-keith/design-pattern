package com.keith.pattern.decorator;

/**
 * @author keith
 * @version 1.0
 * @date 2020-06-09
 */
public class Sugar extends Decorator{
    public Sugar(Drink drink) {
        super(drink);
        setPrice(0.0f);
        setType("糖");
    }
}
