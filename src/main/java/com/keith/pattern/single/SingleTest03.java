package com.keith.pattern.single;

/**
 * @author keith
 * @version 1.0
 * @date 2020-05-19
 **/
public class SingleTest03 {
}

/**
 * 双重检查应用实例
 */
class Singleton06 {

    private Singleton06() {

    }

    private static Singleton06 instance;

    public static Singleton06 getInstance() {
        if (instance == null) {
            synchronized (Singleton06.class) {
                if (instance == null) {
                    instance = new Singleton06();
                }
            }
        }
        return instance;
    }
}