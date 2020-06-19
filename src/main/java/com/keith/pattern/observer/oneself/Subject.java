package com.keith.pattern.observer.oneself;

/**
 * 主题接口
 * @author keith
 * @version 1.0
 * @date 2020-06-19
 */
public interface Subject {

    /**
     * 添加订阅者
     */
    void add(Observer observer);

    /**
     * 移除订阅者
     */
    void remove(Observer observer);

    /**
     * 通知所有订阅者
     */
    void notifyChanged();
}
