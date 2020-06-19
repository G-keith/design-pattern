package com.keith.pattern.mediator;

/**
 * @author keith
 * @version 1.0
 * @date 2020-06-19
 */
public abstract class Mediator {
    private Man  man;

    private WoMan woMan;

    public Man getMan() {
        return man;
    }

    public void setMan(Man man) {
        this.man = man;
    }

    public WoMan getWoMan() {
        return woMan;
    }

    public void setWoMan(WoMan woMan) {
        this.woMan = woMan;
    }

    /**
     * 交互条件
     */
    public abstract void getCompanion(Person person);
}
