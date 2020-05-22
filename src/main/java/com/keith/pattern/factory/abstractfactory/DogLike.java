package com.keith.pattern.factory.abstractfactory;

/**
 * @author keith
 * @version 1.0
 * @date 2020-05-22
 **/
public class DogLike implements Like {
    @Override
    public void like() {
        System.out.println("狗喜欢跑步");
    }
}
