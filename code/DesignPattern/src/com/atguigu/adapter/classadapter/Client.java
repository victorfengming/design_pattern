package com.atguigu.adapter.classadapter;


public class Client {
    public static void main(String[] args) {
        System.out.println("--类适配器模式--");
        Phone phone = new Phone();
        phone.charging(new VoltageAdapter());
        /*
        --类适配器模式--
        电压220福特
        电压为5V,可以充电~~~

        Process finished with exit code 0
        * */
    }
}
