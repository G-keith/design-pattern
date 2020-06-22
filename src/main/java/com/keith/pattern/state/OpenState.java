package com.keith.pattern.state;

/**
 * @author keith
 * @version 1.0
 * @date 2020-06-22
 */
public class OpenState extends State{
    @Override
    public void open() {
        System.out.println("不能重复打开门");
    }

    @Override
    public void close() {
        System.out.println("门关闭了");
    }
}
