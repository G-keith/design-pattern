package com.keith.pattern.adapter.type;

/**
 * 类适配器,讲MP4格式适配成MP3
 * @author keith
 * @version 1.0
 * @date 2020-06-04
 */
public class ExpensiveAdapter extends MP4 implements MP3 {
    @Override
    public void action() {
        String s=play();
        System.out.println(s);
        s="MP3";
        System.out.println(s);
    }
}
