package com.keith.pattern.memetno;

import java.math.BigDecimal;

/**
 * 员工信息
 * @author keith
 * @version 1.0
 * @date 2020-06-19
 */
public class Emp {

    private String name;

    private  int age;

    private BigDecimal salary;

    public Memetno memetno(){
        return new Memetno(this);
    }

    public void recovery(Memetno memetno){
        this.age=memetno.getAge();
        this.salary=memetno.getSalary();
    }

    public Emp(String name, int age, BigDecimal salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
