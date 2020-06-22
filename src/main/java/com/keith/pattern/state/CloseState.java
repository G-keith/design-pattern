package com.keith.pattern.state;

/**
 * @author keith
 * @version 1.0
 * @date 2020-06-22
 */
public class CloseState extends State{
    @Override
    public void open() {
        System.out.println("门已经打开了");
    }

    @Override
    public void close() {
        System.out.println("不能重复关闭门");
    }
}
