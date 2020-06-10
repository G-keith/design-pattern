package com.keith.pattern.composite;

/**
 * @author keith
 * @version 1.0
 * @date 2020-06-10
 */
public class Test {

    public static void main(String[] args) {
        Composite composite=new Composite("总公司");
        Company company=new Company("无锡分公司");
        composite.add(company);

        Composite composite1=new Composite("北京总公司");
        Company company1=new Company("赣州分公司");
        Company company2=new Company("昆山分公司");
        composite1.add(company1);
        composite1.add(company2);
        composite.add(composite1);
//        composite.name();
        System.out.println(composite.getAssoications());
    }
}
