package com.keith.pattern.visitor;

/**
 * 收入账单
 * @author keith
 * @version 1.0
 * @date 2020-06-18
 */
public class IncomeBill implements Bill{
    private final double amount;
    private final String item;

    public IncomeBill(double amount, String item) {
        this.amount = amount;
        this.item = item;
    }

    public double getAmount() {
        return amount;
    }

    public String getItem() {
        return item;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
