package com.keith.pattern.mediator;

/**
 * @author keith
 * @version 1.0
 * @date 2020-06-19
 */
public class WoMan extends Person{
    public WoMan(String name, int condition, Mediator mediator) {
        super(name, condition, mediator);
    }

    @Override
    public void getCompanion(Person person) {
        getMediator().setWoMan(this);
        getMediator().getCompanion(person);
    }
}
