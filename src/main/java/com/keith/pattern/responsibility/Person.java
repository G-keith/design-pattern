package com.keith.pattern.responsibility;

/**
 * @author keith
 * @version 1.0
 * @date 2020-06-23
 */
public class Person extends ApplyInfo{
    @Override
    public void setMoney(int money) {
        super.money=money;
    }

    @Override
    public int getMoney() {
        return super.money;
    }
}
