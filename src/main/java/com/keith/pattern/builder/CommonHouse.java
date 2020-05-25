package com.keith.pattern.builder;

/**
 * @author keith
 * @version 1.0
 * @date 2020-05-25
 **/
public class CommonHouse extends AbstractHouse {
    private House house;

    public CommonHouse() {
        house = new House();
    }

    @Override
    public void buildA() {
        house.setBuildA("普通房子打桩");
    }

    @Override
    public void buildB() {
        house.setBuildB("普通房子砌墙");

    }
    @Override
    public void buildC() {
        house.setBuildC("普通房子封顶");
    }

    @Override
    public House getHouse() {
        return house;
    }
}
