package com.keith.pattern.command;

/**
 * @author keith
 * @version 1.0
 * @date 2020-06-18
 */
public class Test {

    public static void main(String[] args) {
        //产生命令
        Command addWebCommand=new AddWebCommand();

        Invoker invoker=new Invoker();

        invoker.setCommand(addWebCommand);
        invoker.action();

        Command command=new DeleteBackStageCommand();

        invoker.setCommand(command);
        invoker.action();
    }
}
