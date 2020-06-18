package com.keith.pattern.command;

/**
 * 前端
 * @author keith
 * @version 1.0
 * @date 2020-06-18
 */
public class Web extends Group{
    @Override
    public void add() {
        System.out.println("前端增加页面");
    }

    @Override
    public void delete() {
        System.out.println("前端删除页面");
    }

    @Override
    public void change() {
        System.out.println("前端修改页面");
    }

    @Override
    public void find() {
        System.out.println("前端");
    }

    @Override
    public void plan() {
        System.out.println("前端需求更改计划");
    }
}
