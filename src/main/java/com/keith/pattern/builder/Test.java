package com.keith.pattern.builder;

/**
 * @author keith
 * @version 1.0
 * @date 2020-05-25
 **/
public class Test {

    public static void main(String[] args) {
        Director director=new Director();
        House house=director.create(new CommonHouse());
        System.out.println(house.toString());
    }
}
