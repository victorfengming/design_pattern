package com.atguigu.facade;


public class DVDPlayer {

    // 使用单例模式,恶汉式
    private static DVDPlayer instance = new DVDPlayer();

    public static DVDPlayer getInstance() {
        return instance;
    }
    //开
    public void on() {
        System.out.println("DVD ON");
    }
    // 关
    public void off() {
        System.out.println("DVD off");
    }
    // 播放
    public void play() {
        System.out.println("DVD play");
    }
    // 暂停
    public void pause() {
        System.out.println("DVD pause");
    }


}
