package com.keith.pattern.builder;

/**
 * @author keith
 * @version 1.0
 * @date 2020-05-25
 **/
public class Director {
    //指挥工人按顺序造房
    public House create(AbstractHouse abstractHouse) {
        abstractHouse.buildA();
        abstractHouse.buildB();
        abstractHouse.buildC();
        return abstractHouse.getHouse();
    }
}
