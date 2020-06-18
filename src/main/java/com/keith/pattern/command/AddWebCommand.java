package com.keith.pattern.command;

/**
 * 添加页面命令
 * @author keith
 * @version 1.0
 * @date 2020-06-18
 */
public class AddWebCommand extends Command{
    @Override
    protected void execute() {
        web.find();
        web.add();
        web.plan();
    }
}
