package com.atguigu.decorator;


public class Client {
    public static void main(String[] args) {

        // 用装饰者模式下订单,: 2份巧克力+1份牛奶的LongBlack
        // 1. 点一份 LongBlack
        Drink order = new LongBlack();
        System.out.println("费用1:"+order.cost());
        System.out.println("描述"+order.getDes());
    }
}
