package com.atguigu.proxy.cglib;


public class TeacherDao {
    public String teach() {
        System.out.println("我是 cglib 代理, 不需要实现接口");
        System.out.println("老师授课中...");
        return "hello";
    }
}
