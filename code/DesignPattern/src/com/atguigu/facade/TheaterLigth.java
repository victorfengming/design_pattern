package com.atguigu.facade;

public class TheaterLigth {
    private static TheaterLigth instance = new TheaterLigth();

    public static TheaterLigth getInstance() {
        return instance;
    }

    // 开
    public void on() {
        System.out.println("TheaterLigth on");
    }

    // 关
    public void dim() {
        System.out.println("TheaterLigth dim");
    }

    // 音量调大
    public void bright() {
        System.out.println("TheaterLigth bright");
    }
}
