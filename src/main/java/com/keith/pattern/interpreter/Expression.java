package com.keith.pattern.interpreter;

/**
 * 解释器抽象类
 * @author keith
 * @version 1.0
 * @date 2020-06-19
 */
public abstract class Expression {

    public abstract int interpret(Context con);
}
