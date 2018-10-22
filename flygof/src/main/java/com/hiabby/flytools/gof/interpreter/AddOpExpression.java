package com.hiabby.flytools.gof.interpreter;

/**
 * @desc
 * @date 2018/10/22
 **/
public class AddOpExpression extends OpExpression {

    public AddOpExpression(IExpression iExpression1, IExpression iExpression2) {
        super(iExpression1, iExpression2);
    }

    @Override
    public int calculation() {
        return iExpression1.calculation() + iExpression2.calculation();
    }
}
