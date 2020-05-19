package com.keith.pattern.single;

/**
 * @author keith
 * @version 1.0
 * @date 2020-05-19
 **/
public class SingleTest02 {
}

/**
 * 懒汉式-线程不安全
 */
class Singleton03 {

    private Singleton03() {

    }

    private static Singleton03 instance;

    public static Singleton03 getInstance() {
        if (instance == null) {
            instance = new Singleton03();
        }
        return instance;
    }
}

/**
 * 懒汉式-线程安全，同步方法
 */
class Singleton04 {

    private Singleton04() {

    }

    private static Singleton04 instance;

    public static synchronized Singleton04 getInstance() {
        instance = new Singleton04();
        return instance;
    }
}

/**
 * 懒汉式-线程安全，同步代码块
 */
class Singleton05 {

    private Singleton05() {

    }

    private static Singleton05 instance;

    public static Singleton05 getInstance() {
        if (instance == null) {
            synchronized (Singleton05.class) {
                instance = new Singleton05();
            }
        }
        return instance;
    }
}