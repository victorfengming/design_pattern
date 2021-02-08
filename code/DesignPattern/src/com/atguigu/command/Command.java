package com.atguigu.command;


public interface Command {
    // 执行动作(操作_)
    public void execute();

    // 撤销动作(操作
    public void undo();
}
