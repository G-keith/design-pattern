package com.keith.pattern.decorator;

/**
 * @author keith
 * @version 1.0
 * @date 2020-06-09
 */
public class Decorator extends Drink {
    private Drink drink;

    public Decorator(Drink drink) {
        this.drink = drink;
    }

    @Override
    public float cost() {
        return super.getPrice() + drink.cost();
    }
}
