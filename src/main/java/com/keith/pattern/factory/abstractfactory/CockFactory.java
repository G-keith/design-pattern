package com.keith.pattern.factory.abstractfactory;

/**
 * @author keith
 * @version 1.0
 * @date 2020-05-22
 **/
public class CockFactory implements Factory {
    @Override
    public Animal produce() {
        return new Cock();
    }

    @Override
    public Like like() {
        return new CockLike();
    }
}
