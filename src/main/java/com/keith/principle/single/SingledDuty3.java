package com.keith.principle.single;

/**
 * @author keith
 * @version 1.0
 * @date 2020-05-16
 **/
public class SingledDuty3 {

    public static void main(String[] args) {
        Vehicle3 vehicle = new Vehicle3();
        vehicle.run("摩托车");
        vehicle.run("汽车");
        vehicle.runAir("飞机");
    }
}

/**
 * 交通工具类
 * 部分遵守了单一职责；在方法级别上遵守了单一职责原则
 */
class Vehicle3 {
    public void run(String vehicle) {
        System.out.println(vehicle + "在公路上跑");
    }

    public void runAir(String vehicle) {
        System.out.println(vehicle + "在天上飞");
    }

    public void runWater(String vehicle) {
        System.out.println(vehicle + "在水中游");
    }
}