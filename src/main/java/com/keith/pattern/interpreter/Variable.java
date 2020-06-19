package com.keith.pattern.interpreter;

/**
 * @author keith
 * @version 1.0
 * @date 2020-06-19
 */
public class Variable extends Expression{
    @Override
    public int interpret(Context con) {
        //this为调用interpret方法的Variable对象
        return con.lookupValue(this);
    }

}

