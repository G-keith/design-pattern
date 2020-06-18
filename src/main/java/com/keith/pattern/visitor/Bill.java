package com.keith.pattern.visitor;

/**
 * 账单-被访问者
 * @author keith
 * @version 1.0
 * @date 2020-06-18
 */
public interface Bill {

    /**
     * 接受访问者
     */
    void accept(Visitor visitor);
}
