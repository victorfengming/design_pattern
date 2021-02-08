package com.atguigu.command;


public class Client {
    public static void main(String[] args) {
        // 使用命令设计模式        // 完成通过遥控器对电灯的操作
        // 需要一个遥控器
        RemoteController remoteController = new RemoteController();

        // 创建电灯的对象,(接受者
        LightReceiver lightReceiver = new LightReceiver();
        // 创建电灯的相关的开关命令
        LightOnCommand lightOnCommand = new LightOnCommand(lightReceiver);
        // 创建电灯的开关命令
        LightOffCommand lightOffCommand = new LightOffCommand(lightReceiver);
        //给我们的遥控器设置相关的命令, 比如no= 0 的是电灯的开和关的操作
        remoteController.setCommand(0, lightOnCommand, lightOffCommand);
        System.out.println("-----按下灯的开的按钮------");
        remoteController.onButtonWasPushed(0);
        System.out.println("-----按下灯的关的按钮------");
        remoteController.offButtonWasPushed(0);
        System.out.println("-----撤销-----------------");
        remoteController.undoButtonWasPushed();

        // 创建电视的对象,(接受者
        TVReceiver tvReceiver = new TVReceiver();
        // 创建电视的相关的开关命令
        TVOnCommand tvOnCommand = new TVOnCommand(tvReceiver);
        // 创建电视的开关命令
        TVOffCommand tvOffCommand = new TVOffCommand(tvReceiver);
        //给我们的遥控器设置相关的命令, 比如no= 1 的是电视的开和关的操作
        remoteController.setCommand(1, tvOnCommand, tvOffCommand);
        System.out.println("-----按下视的开的按钮------");
        remoteController.onButtonWasPushed(1);
        System.out.println("-----按下视的关的按钮------");
        remoteController.offButtonWasPushed(1);
        System.out.println("-----撤销-----------------");
        remoteController.undoButtonWasPushed();

        /**
         *-----按下灯的开的按钮------
         * 电灯打开了
         * -----按下灯的关的按钮------
         * 电灯关闭了
         * -----撤销-----------------
         * 电灯打开了
         * -----按下视的开的按钮------
         * 电视打开了
         * -----按下视的关的按钮------
         * 电视关闭了
         * -----撤销-----------------
         * 电视打开了
         *
         * Process finished with exit code 0
         */
    }
}
