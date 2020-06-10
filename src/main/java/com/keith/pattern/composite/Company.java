package com.keith.pattern.composite;

/**
 * 叶子
 * @author keith
 * @version 1.0
 * @date 2020-06-10
 */
public class Company implements Assoication {
    private String name;

    public Company(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public void name() {
        System.out.println(name);
    }
}
