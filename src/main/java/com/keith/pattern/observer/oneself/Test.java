package com.keith.pattern.observer.oneself;

/**
 * 观察者模式
 * @author keith
 * @version 1.0
 * @date 2020-06-19
 */
public class Test {

    public static void main(String[] args) {
        Subject subject=new RealSubject();
        Observer observer=new RealObserver();
        subject.add(observer);
        subject.notifyChanged();
    }
}
