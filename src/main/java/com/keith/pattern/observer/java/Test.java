package com.keith.pattern.observer.java;

import java.util.Observer;

/**
 * java自己的观察者模式
 * @author keith
 * @version 1.0
 * @date 2020-06-19
 */
public class Test {

    public static void main(String[] args) {
        RealSubject realSubject=new RealSubject();
        Observer observer=new RealObserver();
        realSubject.addObserver(observer);
        realSubject.makeChanged();
    }
}
