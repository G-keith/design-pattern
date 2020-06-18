package com.keith.pattern.command;

/**
 * @author keith
 * @version 1.0
 * @date 2020-06-18
 */
public abstract class Group {

    public abstract void add();
    public abstract void delete();
    public abstract void change();
    public abstract void find(); // 客户要和某个小组沟通，必须先找到对应的小组
    public abstract void plan(); // 客户要求某小组列出执行计划
}
