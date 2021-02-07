package com.atguigu.proxy;


public class Client {
    public static void main(String[] args) {
        System.out.println("代理模式!");
        // 创建目标对象(被代理对象)
        TeacherDao teacherDao = new TeacherDao();
        // 创建代理对象,同时将被代理对象传递给代理对象
        TeeacherDaoProxy teeacherDaoProxy = new TeeacherDaoProxy(teacherDao);
        // 通过代理对象,调用到被代理对象的方法
        // 即: 执行的是代理对象的方法,代理对象再去调用目标对象的方法
        teeacherDaoProxy.teach();
        /*
        代理模式!
        代理对象开始代里
        老师正在授课中...
        提交...

        Process finished with exit code 0

        * */
    }
}
