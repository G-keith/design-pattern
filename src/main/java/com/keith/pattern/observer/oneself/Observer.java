package com.keith.pattern.observer.oneself;

/**
 *订阅者接口
 * @author keith
 * @version 1.0
 * @date 2020-06-19
 */
public interface Observer {

    /**
     * 接受变动，更新订阅者
     */
    void  update();
}
