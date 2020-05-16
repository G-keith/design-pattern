package com.keith.principle.single;

/**
 * 单一职责案例
 *
 * @author keith
 * @version 1.0
 * @date 2020-05-16
 **/
public class SingledDuty {

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.run("摩托车");
        vehicle.run("汽车");
        vehicle.run("飞机");
    }
}

/**
 * 交通工具类
 */
class Vehicle {
    /**
     * 违反了单一职责原则
     *
     * @param vehicle 交通工具
     */
    public void run(String vehicle) {
        System.out.println(vehicle + "在公路上跑");

    }
}