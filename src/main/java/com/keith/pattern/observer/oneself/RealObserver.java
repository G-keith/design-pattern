package com.keith.pattern.observer.oneself;

/**
 * @author keith
 * @version 1.0
 * @date 2020-06-19
 */
public class RealObserver implements Observer{
    @Override
    public void update() {
        System.out.println("接受了主题变动");
    }
}
