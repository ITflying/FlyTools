package com.hiabby.flytools.gof.interpreter;

/**
 * @desc 非终结符表达式
 * @date 2018/10/22
 **/
public abstract class OpExpression extends IExpression {
    protected IExpression iExpression1, iExpression2;

    public OpExpression(IExpression iExpression1, IExpression iExpression2) {
        this.iExpression1 = iExpression1;
        this.iExpression2 = iExpression2;
    }
}
