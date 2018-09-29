package com.hiabby.flytools.gof;

import com.hiabby.flytools.gof.command.ComputInvoker;
import com.hiabby.flytools.gof.command.ComputerCommand;
import com.hiabby.flytools.gof.command.ComputerRev;
import com.hiabby.flytools.gof.command.PowerCommand;
import org.junit.Test;

/**
 * @desc
 * @date 2018/09/28
 **/
public class CommandTest {
    @Test
    public void test_command() {
        ComputInvoker computInvoker = new ComputInvoker();
        ComputerRev computerRev = new ComputerRev("Macbook");

        ComputerCommand powerCommand = new PowerCommand("关机");

        computInvoker.setComputerCommand(powerCommand);
        computInvoker.action();

        computerRev.action();
    }
}
