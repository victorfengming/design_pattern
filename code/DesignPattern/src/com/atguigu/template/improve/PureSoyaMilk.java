package com.atguigu.template.improve;


public class PureSoyaMilk extends SoyaMilk{
    @Override
    void addCondiments() {
        // 空实现
    }

    @Override
    boolean customerWantCondiments() {
        // 重写这个地方
        return false;
    }
}
