package com.hiabby.flytools.gof;

import com.hiabby.flytools.gof.interpreter.FinalCalculation;
import org.junit.Test;

/**
 * @desc
 * @date 2018/10/22
 **/
public class InterpreterTest {
    @Test
    public void test_interpreter() {
        String expression = "1+1+3+4+123+32";
        FinalCalculation calculation = new FinalCalculation(expression);
        System.out.println(expression + " = " + calculation.getCalculateRes());
    }
}
