package com.atguigu.bridge;

public class Vivo implements Brand{
    @Override
    public void open() {
        System.out.println("vivo手机开机");
    }

    @Override
    public void close() {
        System.out.println("vivo shoyji关机");
    }

    @Override
    public void call() {
        System.out.println("vivo手机打电话!");
    }
}
