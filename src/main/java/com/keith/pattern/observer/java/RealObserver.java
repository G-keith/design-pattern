package com.keith.pattern.observer.java;


import java.util.Observable;
import java.util.Observer;

/**
 * @author keith
 * @version 1.0
 * @date 2020-06-19
 */
public class RealObserver implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("有新消息更新");
    }
}
