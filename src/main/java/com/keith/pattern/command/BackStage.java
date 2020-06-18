package com.keith.pattern.command;

/**
 * 后台
 * @author keith
 * @version 1.0
 * @date 2020-06-18
 */
public class BackStage extends Group{
    @Override
    public void add() {
        System.out.println("后台增加接口");
    }

    @Override
    public void delete() {
        System.out.println("后台删除接口");
    }

    @Override
    public void change() {
        System.out.println("后台修改接口");
    }

    @Override
    public void find() {
        System.out.println("后台");
    }

    @Override
    public void plan() {
        System.out.println("后台需求计划");
    }
}
