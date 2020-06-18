package com.keith.pattern.template;

/**
 * @author keith
 * @version 1.0
 * @date 2020-06-18
 */
public class Child extends People{

    private boolean studyFlag=true;

    private boolean workFlag=true;
    public void setStudyFlag(boolean studyFlag) {
        this.studyFlag = studyFlag;
    }

    public void setWorkFlag(boolean workFlag) {
        this.workFlag = workFlag;
    }

    @Override
    protected void getUp() {
        System.out.println("小孩起床");
    }

    @Override
    protected void work() {
        System.out.println("小孩工作");
    }

    @Override
    protected void study() {
        System.out.println("小孩学习");
    }

    @Override
    protected void sleep() {
        System.out.println("小孩睡觉");
    }

    @Override
    public boolean isWork(){
        return workFlag;
    }

    @Override
    public boolean isStudy(){
        return studyFlag;
    }
}
