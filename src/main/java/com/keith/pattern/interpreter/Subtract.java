package com.keith.pattern.interpreter;

/**
 * 减法
 *
 * @author keith
 * @version 1.0
 * @date 2020-06-19
 */
public class Subtract extends Expression {
    private final Expression left;
    private final Expression right;

    public Subtract(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpret(Context con) {
        return left.interpret(con) - right.interpret(con);
    }
}
