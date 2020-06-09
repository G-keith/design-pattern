package com.keith.pattern.bridging;

/**
 * 桥接模式-桥接者
 * @author keith
 * @version 1.0
 * @date 2020-06-09
 */
public abstract class Phone {
    private final Brand brand;

    public Phone(Brand brand) {
        this.brand = brand;
    }

    protected void call(){
        this.brand.call();
    }

    protected void message(){
        this.brand.message();
    }
}
