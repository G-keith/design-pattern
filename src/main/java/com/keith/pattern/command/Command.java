package com.keith.pattern.command;

/**
 * @author keith
 * @version 1.0
 * @date 2020-06-18
 */
public abstract class Command {

    protected Web web=new Web();
    protected BackStage backStage=new BackStage();

    /**
     * 执行命令
     */
    protected abstract void execute();
}
