package com.keith.principle.single;

/**
 * @author keith
 * @version 1.0
 * @date 2020-05-16
 **/
public class SingledDuty2 {

    public static void main(String[] args) {
        RoadVehicle roadVehicle=new RoadVehicle();
        roadVehicle.run("摩托车");
        roadVehicle.run("汽车");

        AirVehicle airVehicle=new AirVehicle();
        airVehicle.run("飞机");
    }
}

/**
 * 遵守的单一职责原则，但是改动很大，需要修改地方多
 */
class RoadVehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + "在公路上跑");
    }
}

class AirVehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + "在天上飞");
    }
}

class WaterVehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + "在水里游");
    }
}
