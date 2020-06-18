package com.keith.pattern.visitor;

/**
 * @author keith
 * @version 1.0
 * @date 2020-06-18
 */
public class ConsumeBill implements Bill{

    private final double amount;
    private final String item;

    public ConsumeBill(double amount, String item) {
        this.amount = -amount;
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
