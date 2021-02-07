package com.atguigu.flyweight;

// 具体网站
public class ConcreteWebsite extends WebSite{
    // 共享的部分,内部状态
    private String type = "";//网站发布形式(类型)

    // 构造器
    public ConcreteWebsite(String type) {
        this.type = type;
    }

    @Override
    public void use() {
        System.out.println("网站的发布形式为: "+type+"输出");
    }
}
