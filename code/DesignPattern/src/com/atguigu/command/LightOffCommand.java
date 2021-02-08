package com.atguigu.command;


public class LightOffCommand implements Command {
    LightReceiver light;

    public LightOffCommand(LightReceiver light) {
        super();
        this.light = light;
    }

    @Override
    public void execute() {
        // 调用接受者方法
        light.off();
    }

    @Override
    public void undo() {
        // 调用接受者方法
        light.on();
    }
}
