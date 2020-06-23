package com.keith.pattern.responsibility;

/**
 * 责任链模式-实现不同职位审批不同金额
 * @author keith
 * @version 1.0
 * @date 2020-06-23
 */
public class Test {

    public static void main(String[] args) {
        //领导们
        Leader500 leader500 = new Leader500();
        Leader1000 leader1000 = new Leader1000();

        leader500.setCurrentMoney(500);
        leader1000.setCurrentMoney(1000);

        leader500.setSuperiorLeader(leader1000);

        //申请人
        Person person = new Person();
        person.setMoney(1000);

        leader500.dealInfo(person);
    }
}
