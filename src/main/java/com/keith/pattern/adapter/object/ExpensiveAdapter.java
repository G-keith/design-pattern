package com.keith.pattern.adapter.object;

/**
 * 对象适配器,讲MP4格式适配成MP3
 * @author keith
 * @version 1.0
 * @date 2020-06-04
 */
public class ExpensiveAdapter implements MP3 {
    private MP4 mp4;

    public ExpensiveAdapter(){
        mp4=new MP4();
    }
    @Override
    public void action() {
        String s=mp4.play();
        System.out.println(s);
        s="MP3";
        System.out.println(s);
    }
}
