package com.keith.pattern.template;

/**
 * 成年人
 * @author keith
 * @version 1.0
 * @date 2020-06-18
 */
public class Adult extends People{

    private boolean studyFlag=true;

    private boolean workFlag=true;
    public void setStudyFlag(boolean studyFlag) {
        this.studyFlag = studyFlag;
    }

    public void setWorkFlag(boolean workFlag) {
        this.workFlag = workFlag;
    }

    @Override
    public void getUp() {
        System.out.println("成年人起床");
    }

    @Override
    public void work() {
        System.out.println("成年人工作");
    }

    @Override
    public void study() {
        System.out.println("成年人学习");
    }

    @Override
    public void sleep() {
        System.out.println("成年人睡觉");
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
