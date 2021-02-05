package com.atguigu.decorator;

/**
 * 具体的Decorator,这里就是调味品
 */
public class Chocolate extends Decorator{
    public Chocolate(Drink obj) {
        super(obj);
        setDes("巧克力");
        // 调味品的价格,是3块钱
        setPrice(3.0f);
    }
}
