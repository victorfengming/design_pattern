package com.atguigu.adapter.objectadapter;


// 被适配的类
public class Voltage220V {
    // 这个不用变
    public int output220V() {
        int src = 220;
        System.out.println("电压"+src+"福特");
        return src;
    }
}
