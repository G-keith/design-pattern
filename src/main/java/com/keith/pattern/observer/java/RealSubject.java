package com.keith.pattern.observer.java;

import java.util.Observable;

/**
 * @author keith
 * @version 1.0
 * @date 2020-06-19
 */
public class RealSubject extends Observable {

    public void makeChanged() {
        setChanged();
        notifyObservers();
    }
}
