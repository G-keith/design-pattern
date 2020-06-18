package com.keith.pattern.template;

/**
 * 模板方法模式
 * @author keith
 * @version 1.0
 * @date 2020-06-18
 */
public class Test {

    public static void main(String[] args) {
        Adult adult=new Adult();
        adult.run();

        Child child=new Child();
        child.setWorkFlag(false);
        child.run();
    }
}
