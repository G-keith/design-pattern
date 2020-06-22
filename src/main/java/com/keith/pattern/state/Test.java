package com.keith.pattern.state;

/**
 * 状态模式
 * @author keith
 * @version 1.0
 * @date 2020-06-22
 */
public class Test {

    public static void main(String[] args) {
        StateContext stateContext=new StateContext();
        stateContext.close();
        stateContext.open();
        stateContext.close();
    }
}
