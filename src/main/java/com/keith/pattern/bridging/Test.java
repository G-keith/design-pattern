package com.keith.pattern.bridging;

/**
 *桥接模式
 * @author keith
 * @version 1.0
 * @date 2020-06-09
 */
public class Test {

    public static void main(String[] args) {
        Phone phone1 = new FoldedPhone(new XiaoMi());
        phone1.call();
        phone1.message();

        System.out.println("=======================");

        Phone phone2 = new FoldedPhone(new HuaWei());

        phone2.call();
        phone2.message();

        System.out.println("==============");

        UpRightPhone phone3 = new UpRightPhone(new XiaoMi());

        phone3.call();
        phone3.message();

        System.out.println("==============");

        UpRightPhone phone4 = new UpRightPhone(new HuaWei());

        phone4.call();
        phone4.message();
    }
}
