package com.keith.pattern.command;

/**
 * 删除接口命令
 * @author keith
 * @version 1.0
 * @date 2020-06-18
 */
public class DeleteBackStageCommand extends Command{
    @Override
    protected void execute() {
        backStage.find();
        backStage.delete();
        backStage.plan();
    }
}
