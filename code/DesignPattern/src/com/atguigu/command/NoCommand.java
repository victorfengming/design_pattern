package com.atguigu.command;

/**
 * 没有任何命令,即;空执行,初始化 每个按钮,
 * 当调用空命令时,对象什么都不做
 * 其实,这是一种设计模式,可以省掉对于空的判断
 */
public class NoCommand implements Command{

    @Override
    public void execute() {

    }

    @Override
    public void undo() {

    }
}
