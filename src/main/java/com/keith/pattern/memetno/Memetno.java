package com.keith.pattern.memetno;

import java.math.BigDecimal;

/**
 * 备忘录
 * @author keith
 * @version 1.0
 * @date 2020-06-19
 */
public class Memetno {

    private int age;

    private BigDecimal salary;

    public Memetno(Emp e) {
        this.age=e.getAge();
        this.salary=e.getSalary();
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }
}
