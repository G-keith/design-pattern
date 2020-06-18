package com.keith.pattern.visitor;

/**
 * @author keith
 * @version 1.0
 * @date 2020-06-18
 */
public class CPA implements Visitor{
    @Override
    public void visit(ConsumeBill consumeBill) {
        if ("工资".equals(consumeBill.getItem())) {
            System.out.println("注会查看工资是否交个人所得税。");
        }else{
            System.out.println("注会查看其他是否开发票。");
        }

    }

    @Override
    public void visit(IncomeBill incomeBill) {
        System.out.println("注会查看收入交税了没。");
    }
}
