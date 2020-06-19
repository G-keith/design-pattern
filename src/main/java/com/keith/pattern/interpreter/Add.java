package com.keith.pattern.interpreter;

/**
 * 非终结符表达式角色
 * 加
 * @author keith
 * @version 1.0
 * @date 2020-06-19
 */
public class Add extends Expression {
    private final Expression left;
    private final Expression right;

    public Add(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpret(Context con) {
        return left.interpret(con) + right.interpret(con);
    }
}
