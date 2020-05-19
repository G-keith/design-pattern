package com.keith.pattern.single;

/**
 * @author keith
 * @version 1.0
 * @date 2020-05-19
 **/
public class SingleTest04 {
}

/**
 * 静态内部类
 */
class Singleton07 {

    private Singleton07() {

    }

    private static class SingletonInstance {
        private final static Singleton07 INSTANCE = new Singleton07();
    }

    public static Singleton07 getInstance() {
        return SingletonInstance.INSTANCE;
    }
}