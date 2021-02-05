package com.atguigu.decorator;


public class Decorator extends Drink {
    private Drink obj;

    public Decorator(Drink obj) {
        // 组合
        this.obj = obj;
    }

    @Override
    public float cost() {
        // 自己价格getprice
        return super.getPrice() + obj.cost();
    }

    @Override
    public String getDes() {
        // 输出被装饰者信息
        return des + " " + getPrice() + "&&" + obj.getDes();
//        super不写也行
//        return super.des + " " + super.getPrice() + "&&" + obj.getDes();
    }
}
