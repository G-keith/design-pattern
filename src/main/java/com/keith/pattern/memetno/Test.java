package com.keith.pattern.memetno;

import java.math.BigDecimal;

/**
 * 备忘录模式
 * 数据恢复之前的数据
 * @author keith
 * @version 1.0
 * @date 2020-06-19
 */
public class Test {

    public static void main(String[] args) {
        Caretaker taker = new Caretaker();

        Emp emp = new Emp("张三",20,new BigDecimal(2000));
        System.out.println("1.姓名:"+emp.getName()+";  年龄:"+emp.getAge()+";  薪水:"+emp.getSalary());

        // 备份
        int index=taker.setMemetno(emp.memetno());
        System.out.println(index);
        emp.setName("李四");
        emp.setAge(30);
        emp.setSalary(new BigDecimal(6000));
        System.out.println("2.姓名:"+emp.getName()+";  年龄:"+emp.getAge()+";  薪水:"+emp.getSalary());

        // 恢复
        emp.recovery(taker.getMemotno(0));
        System.out.println("3.姓名:"+emp.getName()+";  年龄:"+emp.getAge()+";  薪水:"+emp.getSalary());
    }
}
