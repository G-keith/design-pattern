package com.keith.pattern.interpreter;

/**
 * 终结符
 *
 * @author keith
 * @version 1.0
 * @date 2020-06-19
 */
public class Constant extends Expression {

    private int i;

    public Constant(int i) {
        this.i = i;
    }

    @Override
    public int interpret(Context con) {
        return i;
    }
}
