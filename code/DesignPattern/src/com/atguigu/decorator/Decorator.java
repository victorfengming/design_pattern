package com.atguigu.decorator;


public class Decorator extends Drink {
    private Drink obj;

    // 构造
    public Decorator(Drink obj) {
        // 组合
        this.obj = obj;
    }

    // 返回价格
    @Override
    public float cost() {
        // 自己价格getprice
        return super.getPrice() + obj.cost();
    }

    // 描述
    @Override
    public String getDes() {
        // 输出被装饰者信息
        return des + " " + getPrice() + "&&" + obj.getDes();
        //        super不写也行
        //        return super.des + " " + super.getPrice() + "&&" + obj.getDes();
    }
}
