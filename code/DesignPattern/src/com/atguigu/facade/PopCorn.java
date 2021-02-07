package com.atguigu.facade;


// 爆米花
public class PopCorn {
     // 使用单例模式,恶汉式
    private static PopCorn instance = new PopCorn();

    public static PopCorn getInstance() {
        return instance;
    }

    //开
    public void on() {
        System.out.println("PopCorn ON");
    }
    // 关
    public void off() {
        System.out.println("PopCorn off");
    }
    // 播放
    public void play() {
        System.out.println("PopCorn play");
    }
    // 暂停
    public void pause() {
        System.out.println("PopCorn pause");
    }


}
