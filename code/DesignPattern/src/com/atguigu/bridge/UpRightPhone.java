package com.atguigu.bridge;


public class UpRightPhone extends Phone{

    // 构造器
    public UpRightPhone(Brand brand) {
        super(brand);
    }

    @Override
    protected void open() {
        super.open();
        System.out.println("打开直板样式手机");
    }

    @Override
    protected void close() {
        super.close();
        System.out.println("关闭直板样式手机");
    }

    @Override
    protected void call() {
        super.call();
        System.out.println("直板样式手机打电话");
    }
}
