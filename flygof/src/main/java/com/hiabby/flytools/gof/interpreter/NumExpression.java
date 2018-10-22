package com.hiabby.flytools.gof.interpreter;

/**
 * @desc 终结符表达式
 * @date 2018/10/22
 **/
public class NumExpression extends IExpression {
    private int num;

    public NumExpression(int num) {
        this.num = num;
    }

    @Override
    public int calculation() {
        return num;
    }
}
