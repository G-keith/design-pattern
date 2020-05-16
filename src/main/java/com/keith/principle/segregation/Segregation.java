package com.keith.principle.segregation;

/**
 * 接口隔离原则
 * A.C类违反了接口隔离原则，应进行提取封装
 * @author keith
 * @version 1.0
 * @date 2020-05-16
 **/
public class Segregation {

    public static void main(String[] args) {

    }
}

interface Interface1 {

    void operation1();

    void operation2();

    void operation3();

    void operation4();

    void operation5();
}

class B implements Interface1 {

    @Override
    public void operation1() {
        System.out.println("B 实现了operation1");
    }

    @Override
    public void operation2() {
        System.out.println("B 实现了operation2");
    }

    @Override
    public void operation3() {
        System.out.println("B 实现了operation3");
    }

    @Override
    public void operation4() {
        System.out.println("B 实现了operation4");
    }

    @Override
    public void operation5() {
        System.out.println("B 实现了operation5");
    }
}

class D implements Interface1 {

    @Override
    public void operation1() {
        System.out.println("D 实现了operation1");
    }

    @Override
    public void operation2() {
        System.out.println("D 实现了operation2");
    }

    @Override
    public void operation3() {
        System.out.println("D 实现了operation3");
    }

    @Override
    public void operation4() {
        System.out.println("D 实现了operation4");
    }

    @Override
    public void operation5() {
        System.out.println("D 实现了operation5");
    }
}

/**
 * A依赖B，使用其中三个方法
 *
 */
class A{
    public void depend1(Interface1 interface1){
        interface1.operation1();
    }

    public void depend2(Interface1 interface1){
        interface1.operation2();
    }

    public void depend3(Interface1 interface1){
        interface1.operation3();
    }
}

/**
 * C依赖D，使用其中三个方法
 */
class C{
    public void depend1(Interface1 interface1){
        interface1.operation1();
    }

    public void depend2(Interface1 interface1){
        interface1.operation4();
    }

    public void depend3(Interface1 interface1){
        interface1.operation5();
    }
}