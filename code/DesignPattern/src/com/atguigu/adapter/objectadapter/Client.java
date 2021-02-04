package com.atguigu.adapter.objectadapter;


public class Client {

    public static void main(String[] args) {
         System.out.println("--对象适配器模式--");
        com.atguigu.adapter.objectadapter.Phone phone = new Phone();
        phone.charging(new VoltageAdapter(new Voltage220V()));
        /*
        --对象适配器模式--
        电压220福特
        使用对象适配器记性转换,~
        适配完成,输出的电压为=5
        电压为5V,可以充电~~~
        * */
    }
}
