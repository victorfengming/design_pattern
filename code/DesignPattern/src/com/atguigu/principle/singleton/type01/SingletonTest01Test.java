package com.atguigu.principle.singleton.type01;


public class SingletonTest01Test {
    public static void main(String[] args) {
        com.atguigu.principle.singleton.type01.SingletonTest01 ins = com.atguigu.principle.singleton.type01.SingletonTest01.getInstance();
        com.atguigu.principle.singleton.type01.SingletonTest01 ins2 = com.atguigu.principle.singleton.type01.SingletonTest01.getInstance();
        System.out.println(ins);
        System.out.println(ins.hashCode());
        System.out.println(ins2);
        System.out.println(ins2.hashCode());
        System.out.println(ins == ins2);
/*
*
*   com.atguigu.principle.singleton.type01.SingletonTest01@1540e19d
    356573597
    com.atguigu.principle.singleton.type01.SingletonTest01@1540e19d
    356573597
    true
*
* */

    }
}
