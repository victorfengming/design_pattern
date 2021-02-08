package com.atguigu.template.improve;


public abstract class SoyaMilk {
    //    模板方法,make,模板方法可以做成final,不让子类去覆盖
    final void make() {
        // 第一步
        select();
        if (customerWantCondiments()) {
            addCondiments();
        }
        soak();
        beat();
    }

    // 选材料
    void select() {
        System.out.println("第一步: 选择好的新鲜黄豆");
    }

    // 添加不同的配料,抽象方法,子类具体实现
    abstract void addCondiments();

    // 浸泡
    void soak() {
        System.out.println("第三部,黄豆和配料开始浸泡,需要3小时");
    }

    //
    void beat() {
        System.out.println("第四部,黄豆和配料放到豆浆机去打碎!");
    }

    // 钩子方法,决定是否添加配料
    boolean customerWantCondiments() {
        // 默认返回
        return true;
    }
}
