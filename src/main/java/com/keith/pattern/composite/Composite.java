package com.keith.pattern.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 主干
 * @author keith
 * @version 1.0
 * @date 2020-06-10
 */
public class Composite implements Assoication{
    private String name;

    public Composite(String name) {
        this.name = name;
    }

    List<Assoication> assoications=new ArrayList<>();

    public void add(Assoication assoication){
        assoications.add(assoication);
    }

    public List<Assoication> getAssoications(){
        return assoications;
    }

    @Override
    public String toString() {
        return "Composite{" +
                "name='" + name + '\'' +
                ", assoications=" + assoications +
                '}';
    }

    @Override
    public void name() {
        System.out.println(name);
        for(Assoication assoication:assoications){
            assoication.name();
        }
    }
}
