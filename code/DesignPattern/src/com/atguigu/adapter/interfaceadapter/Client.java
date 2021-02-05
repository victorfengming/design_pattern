package com.atguigu.adapter.interfaceadapter;


public class Client {
    public static void main(String[] args) {
        // 接口适配,我这里想要用哪个就用哪个
        AbsAdapter absAdapter = new AbsAdapter(){
            // 只需要去覆盖我们需要使用 接口方法

            @Override
            public void m1() {
                System.out.println("使用了m1的方法");
            }
        };

        absAdapter.m1();
        /*
        使用了m1的方法

        Process finished with exit code 0
        * */
    }
}
