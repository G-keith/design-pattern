package com.keith.pattern.facade;

/**
 * 外观模式
 * @author keith
 * @version 1.0
 * @date 2020-06-11
 */
public class Test {

    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.startup();
        computer.shutdown();
    }
}
