package com.atguigu.command;


public class TVOffCommand implements Command {
    TVReceiver tv;

    public TVOffCommand(TVReceiver tv) {
        super();
        this.tv = tv;
    }

    @Override
    public void execute() {
        // 调用接受者方法
        tv.off();
    }

    @Override
    public void undo() {
        // 调用接受者方法
        tv.on();
    }
}
