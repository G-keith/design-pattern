package com.keith.pattern.command;

/**
 * 执行命令人
 * @author keith
 * @version 1.0
 * @date 2020-06-18
 */
public class Invoker {

    private Command command;

    /**
     * 接受命令
     */
    public void setCommand(Command command) {
        this.command = command;
    }

    /**
     * 执行命令
     */
    public void action(){
        command.execute();
    }
}
