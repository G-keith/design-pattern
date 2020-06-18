package com.keith.pattern.visitor;

/**
 * @author keith
 * @version 1.0
 * @date 2020-06-18
 */
public class Test {

    /**
     * 老板和boss（访问者）分别查询账本的收入和支出（被访问者）
     *
     */
    public static void main(String[] args) {
        AccountBook accountBook = new AccountBook();
        //添加两条收入
        accountBook.addBill(new IncomeBill(10000, "卖商品"));
        accountBook.addBill(new IncomeBill(12000, "卖广告位"));
        //添加两条支出
        accountBook.addBill(new ConsumeBill(1000, "工资"));
        accountBook.addBill(new ConsumeBill(2000, "材料费"));

        Boss boss = new Boss();
        CPA cpa = new CPA();

        //两个访问者分别访问账本
        accountBook.show(cpa);
        accountBook.show(boss);

        boss.getTotalConsume();
        boss.getTotalIncome();

    }
}
