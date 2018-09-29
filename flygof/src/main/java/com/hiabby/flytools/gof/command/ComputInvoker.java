package com.hiabby.flytools.gof.command;

/**
 * @desc 调用者
 * @date 2018/09/28
 **/
public class ComputInvoker {
    private ComputerCommand computerCommand;

    public void setComputerCommand(ComputerCommand computerCommand) {
        this.computerCommand = computerCommand;
    }

    public void action() {
        computerCommand.execute();
    }
}
