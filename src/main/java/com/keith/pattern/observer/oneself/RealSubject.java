package com.keith.pattern.observer.oneself;

import java.util.ArrayList;
import java.util.List;

/**
 * @author keith
 * @version 1.0
 * @date 2020-06-19
 */
public class RealSubject implements Subject {

    private final List<Observer> observerList = new ArrayList<>();

    @Override
    public void add(Observer observer) {
        if (!observerList.contains(observer)) {
            observerList.add(observer);
        }
    }

    @Override
    public void remove(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyChanged() {
        observerList.forEach(Observer::update);
    }
}
