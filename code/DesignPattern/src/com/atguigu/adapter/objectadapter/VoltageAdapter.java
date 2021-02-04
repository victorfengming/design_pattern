package com.atguigu.adapter.objectadapter;


public class VoltageAdapter implements IVoltage5V {

    // 我家一个属性
    private Voltage220V voltage220V;

    // 构造器
    public VoltageAdapter(Voltage220V voltage220V) {
        // 通过构造器,传入一个Voltage220V实例
        // 关联关系的聚合关系
        this.voltage220V = voltage220V;
    }

    @Override
    public int output5V() {
        //
        int dst = 0;
        if (null != voltage220V) {
            // 获取220V电压
            int src = voltage220V.output220V();
            //
            System.out.println("使用对象适配器记性转换,~");
            dst = src / 44;
            System.out.println("适配完成,输出的电压为="+dst);
        }
        return dst;
    }
}
