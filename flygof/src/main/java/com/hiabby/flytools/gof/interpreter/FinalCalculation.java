package com.hiabby.flytools.gof.interpreter;

import java.util.Stack;

/**
 * @desc
 * @date 2018/10/22
 **/
public class FinalCalculation {
    protected Stack<IExpression> iExpressions = new Stack<>();

    public FinalCalculation(String expression) {
        IExpression iExpression1, iExpression2;
        String[] expressionArray = expression.split("\\+");
        for (int i = 0; i < expressionArray.length; i++) {
            if (iExpressions.empty()) {
                iExpressions.push(new NumExpression(Integer.valueOf(expressionArray[i])));
            } else {
                iExpression1 = iExpressions.pop();
                iExpression2 = new NumExpression(Integer.valueOf(expressionArray[i]));
                iExpressions.push(new AddOpExpression(iExpression1, iExpression2));
            }
        }
    }

    public int getCalculateRes() {
        return iExpressions.pop().calculation();
    }
}
