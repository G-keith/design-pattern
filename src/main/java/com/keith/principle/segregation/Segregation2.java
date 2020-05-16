package com.keith.principle.segregation;

/**
 * 改进，根据业务，接口隔离开
 *
 * @author keith
 * @version 1.0
 * @date 2020-05-16
 **/
public class Segregation2 {
    public static void main(String[] args) {
        AA aa=new AA();
        aa.depend1(new BB());
        aa.depend2(new BB());
        aa.depend3(new BB());

        CC cc=new CC();
        cc.depend1(new DD());
        cc.depend2(new DD());
        cc.depend3(new DD());
    }
}

interface InterfaceA {

    void operation1();
}

interface InterfaceB {
    void operation2();

    void operation3();
}

interface InterfaceC {

    void operation4();

    void operation5();
}

class BB implements InterfaceA, InterfaceB {

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
}

class DD implements InterfaceA, InterfaceC {

    @Override
    public void operation1() {
        System.out.println("D 实现了operation1");
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
 * A依赖B
 */
class AA {
    public void depend1(InterfaceA interfaceA) {
        interfaceA.operation1();
    }

    public void depend2(InterfaceB interfaceB) {
        interfaceB.operation2();
    }

    public void depend3(InterfaceB interfaceB) {
        interfaceB.operation3();
    }
}

/**
 * C依赖D
 */
class CC {
    public void depend1(InterfaceA interfaceA) {
        interfaceA.operation1();
    }

    public void depend2(InterfaceC interfaceC) {
        interfaceC.operation4();
    }

    public void depend3(InterfaceC interfaceC) {
        interfaceC.operation5();
    }
}