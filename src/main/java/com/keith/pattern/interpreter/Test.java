package com.keith.pattern.interpreter;

/**
 * @author keith
 * @version 1.0
 * @date 2020-06-19
 */
public class Test {

    public static void main(String[] args) {
        Context con = new Context();
        //设置变量、常量
        Variable a = new Variable();
        Variable b = new Variable();
        Constant c = new Constant(2);

        //为变量赋值
        con.addValue(a, 5);
        con.addValue(b, 7);

        //运算，对句子的结构由我们自己来分析，构造
        Expression ex = new Add(new Subtract(a, b), c);
        System.out.println("运算结果为：" + ex.interpret(con));
    }
}
