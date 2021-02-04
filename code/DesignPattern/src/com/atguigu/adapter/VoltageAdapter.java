package com.atguigu.adapter;


public class VoltageAdapter extends Voltage220V implements IVoltage5V {
    @Override
    public int output5V() {
        // 获取220V电压
        int srcV = output220V();
        // 转换成为5V
        int dstV = srcV / 44;
        return dstV;
    }
}
