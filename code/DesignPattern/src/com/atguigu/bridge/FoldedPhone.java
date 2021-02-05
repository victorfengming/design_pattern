package com.atguigu.bridge;

// 折叠是手机类,继承 抽象类Phone
public class FoldedPhone extends Phone{
    //  构造器
    public FoldedPhone(Brand brand) {
        // 初始化
        super(brand);
    }

    @Override
    protected void open() {
        super.open();
        System.out.println("打开折叠样式手机");
    }

    @Override
    protected void close() {
        super.close();
        System.out.println("关闭折叠样式手机");
    }

    @Override
    protected void call() {
        super.call();
        System.out.println("折叠样式手机打电话");
    }

}
