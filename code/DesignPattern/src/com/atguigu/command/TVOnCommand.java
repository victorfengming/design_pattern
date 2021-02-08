package com.atguigu.command;


public class TVOnCommand  implements Command {
    //聚合TVReceiver
    TVReceiver tv;

    //构造器

    public TVOnCommand(TVReceiver tv) {
        super();
        this.tv = tv;
    }

    @Override
    public void execute() {
        // 你认为它是打开
        // 调用接受者的方法
        tv.on();

    }

    @Override
    public void undo() {
        // 调用接受者的方法
        tv.off();
    }
}
