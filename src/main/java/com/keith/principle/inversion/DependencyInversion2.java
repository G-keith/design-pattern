package com.keith.principle.inversion;

/**
 * @author keith
 * @version 1.0
 * @date 2020-05-17
 **/
public class DependencyInversion2 {

    public static void main(String[] args) {
        Person2 person2 = new Person2();
        person2.receive(new Email2());
        person2.receive(new WeXi());
    }
}

interface IReceive {
    /**
     * 获取接收信息
     * @return 接收信息
     */
    String getInfo();
}

class Email2 implements IReceive {
    @Override
    public String getInfo() {
        return "电子邮件信息";
    }
}

class WeXi implements IReceive {

    @Override
    public String getInfo() {
        return "微信信息";
    }
}

class Person2 {

    public void receive(IReceive iReceive) {
        System.out.println(iReceive.getInfo());

    }
}