package com.keith.pattern.visitor;

/**
 * @author keith
 * @version 1.0
 * @date 2020-06-18
 */
public class Boss implements Visitor{

    private double totalIncome;

    private double totalConsume;
    @Override
    public void visit(ConsumeBill consumeBill) {
        System.out.println(totalConsume);
        totalConsume=totalConsume+consumeBill.getAmount();
    }

    @Override
    public void visit(IncomeBill incomeBill) {
        totalIncome=totalIncome+incomeBill.getAmount();
    }

    public double getTotalIncome() {
        System.out.println("老板查看一共收入多少，数目是：" + totalIncome);
        return totalIncome;
    }

    public double getTotalConsume() {
        System.out.println("老板查看一共花费多少，数目是：" + totalConsume);
        return totalConsume;
    }
}
