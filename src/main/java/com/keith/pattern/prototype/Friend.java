package com.keith.pattern.prototype;

import java.io.Serializable;

/**
 * @author keith
 * @version 1.0
 * @date 2020-05-22
 **/
public class Friend implements Serializable {

    private String name;

    public String getName() {
        return name;
    }

    public Friend(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Friend{" +
                "name='" + name + '\'' +
                '}';
    }
}
