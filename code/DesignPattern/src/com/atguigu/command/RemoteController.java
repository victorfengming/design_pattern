package com.atguigu.command;


public class RemoteController {
    // 开按钮的命令数组
    Command[] onCommands;
    Command[] offCommands;

    // 执行撤销命令
    Command undoCommand;

    // 构造器,初始化按钮


    public RemoteController() {
        onCommands = new Command[5];
        offCommands = new Command[5];
        for (int i = 0; i < 5; i++) {
            onCommands[i] = new NoCommand();
            offCommands[i] = new NoCommand();
        }
    }

    // 给我们的按钮设置你需要的命令
    public void setCommand(int no, Command onCommand, Command offCommand) {
        onCommands[no] = onCommand;
        offCommands[no] = offCommand;
    }

    // 安下开按钮
    public void onButtonWasPushed(int no) {
        // 找到你按下的开的按钮,并调用对应的方法
        onCommands[no].execute();
        // 记录你这次的操作,用于撤销
        undoCommand = onCommands[no];
    }

    // 安下关按钮
    public void offButtonWasPushed(int no) {
        // 找到你按下的开的按钮,并调用对应的方法
        offCommands[no].execute();
        // 记录你这次的操作,用于撤销
        undoCommand = offCommands[no];
    }

    // 按下撤销按钮处理
    public void undoButtonWasPushed() {
        // 执行命令
        undoCommand.undo();
        // 只能够撤销一次
        // tood 要是你想要撤销多次,就 不能用一个变量来存放了,要扩展成数组存历史记录嗯
    }

}
