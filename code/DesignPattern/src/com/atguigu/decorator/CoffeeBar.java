package com.atguigu.decorator;


public class CoffeeBar {
    public static void main(String[] args) {

        // 用装饰者模式下订单,: 2份巧克力+1份牛奶的LongBlack
        // 1. 点一份 LongBlack
        Drink order = new LongBlack();
        System.out.println("费用:"+order.cost());
        System.out.println("描述="+order.getDes());

        // 2. 加一份牛奶
        order = new Milk(order);
        // 参数就是返回值,相当于order被装饰了
        // 相当于给我们第一份订单加入了一份牛奶
        System.out.println("order加入一份牛奶 费用="+order.cost());
        System.out.println("order加入一份牛奶 描述="+order.getDes());
        // 3. 加入一份巧克力
        order = new Chocolate(order);

        System.out.println("order加入一份牛奶和巧克力 费用="+order.cost());
        System.out.println("order加入一份牛奶和巧克力 描述="+order.getDes());
        // 4. 再加入一份巧克力
        order = new Chocolate(order);

        System.out.println("order加入一份牛奶和2巧克力 费用="+order.cost());
        System.out.println("order加入一份牛奶和2巧克力 描述="+order.getDes());
        /*
        费用:5.0
        描述=没事咖啡
        order加入一份牛奶 费用=7.0
        order加入一份牛奶 描述=牛奶 2.0&&没事咖啡
        order加入一份牛奶和巧克力 费用=10.0
        order加入一份牛奶和巧克力 描述=巧克力 3.0&&牛奶 2.0&&没事咖啡
        order加入一份牛奶和2巧克力 费用=13.0
        order加入一份牛奶和2巧克力 描述=巧克力 3.0&&巧克力 3.0&&牛奶 2.0&&没事咖啡
        * */
    }
}
