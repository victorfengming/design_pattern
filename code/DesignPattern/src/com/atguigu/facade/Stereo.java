package com.atguigu.facade;


public class Stereo {
    private static Stereo instance = new Stereo();

    public static Stereo getInstance() {
        return instance;
    }

    // 开
    public void on() {
        System.out.println("Stereo on");
    }

    // 关
    public void off() {
        System.out.println("Stereo off");
    }
    // 音量调大
    public void up() {
        System.out.println("Stereo up");
    }
}
