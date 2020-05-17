package com.keith.principle.inversion;

/**
 * 依赖倒转
 * @author keith
 * @version 1.0
 * @date 2020-05-17
 **/
public class DependencyInversion {

    public static void main(String[] args) {
        Person person=new Person();
        person.receive(new Email());
    }
}

class Email {
    public String getInfo() {
        return "电子邮件信息";
    }
}

class Person {

    /**
     * 接收方法和Email强耦合,违反依赖倒转原则
     * @param email 邮件信息
     */
    public void receive(Email email) {
        System.out.println(email.getInfo());

    }
}