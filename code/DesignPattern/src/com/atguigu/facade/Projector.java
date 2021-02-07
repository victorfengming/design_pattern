package com.atguigu.facade;


// 投影仪
public class Projector {
     // 使用单例模式,恶汉式
    private static Projector instance = new Projector();

    public static Projector getInstance() {
        return instance;
    }

    //开
    public void on() {
        System.out.println("Projector ON");
    }
    // 关
    public void off() {
        System.out.println("Projector off");
    }
    // 播放
    public void play() {
        System.out.println("Projector play");
    }
    // 暂停
    public void pause() {
        System.out.println("Projector pause");
    }
    // 暂停
    public void focus() {
        System.out.println("聚焦 pause");
    }


}
