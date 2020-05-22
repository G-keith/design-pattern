package com.keith.pattern.factory.abstractfactory;

/**
 * @author keith
 * @version 1.0
 * @date 2020-05-22
 **/
public class CockLike implements Like {
    @Override
    public void like() {
        System.out.println("鸡喜欢睡觉");
    }
}
