package com.keith.pattern.visitor;

/**
 * 查看账单-访问者
 * @author keith
 * @version 1.0
 * @date 2020-06-18
 */
public interface Visitor {

    void visit(ConsumeBill consumeBill);
    void visit(IncomeBill incomeBill);
}
