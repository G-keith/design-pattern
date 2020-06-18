package com.keith.pattern.template;

/**
 * @author keith
 * @version 1.0
 * @date 2020-06-18
 */
public abstract class People {

    protected abstract void getUp();
    protected abstract void work();
    protected abstract void study();
    protected abstract void sleep();

    /**
     * 钩子函数
     */
    protected boolean isWork(){
        return true;
    }
    protected boolean isStudy(){
        return true;
    }

    /**
     * 模板方法，final修饰，防止子类重写
     */
    protected final void run(){
        getUp();
        if(isWork()){
            work();
        }
        if(isStudy()){
            study();
        }
        sleep();
    }
}
