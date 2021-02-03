package com.atguigu.factory.factorymethod.pizzastore.order;


import com.atguigu.factory.factorymethod.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * ClassName: OrderPizza <br/>
 * Description: OrderPizza <br/>
 * Date: 2021-02-03 15:21 <br/>
 * <br/>
 *
 * @author victor
 * @version 产品版本信息 2021年02月03日15:21分 victor(victorfm@163.com) 新建<br/>
 * <p>
 * 修改记录
 * @email victorfm@163.com
 * @project java_mode
 * @package com.atguigu.factory.factorymethod.pizzastore.order
 */
public abstract class OrderPizza {

    // 定义一个抽象方法,createPizza,让各个工行子类自己实现
    abstract Pizza createPizza(String orderType);

    // 构造器
    public OrderPizza() {
        Pizza pizza = null;
        String orderType;   // 订购披萨类型
        do {
            orderType = getType();
            //我么在这里直接调用createPizza这个方法
            pizza = createPizza(orderType);
            // 这个createPizza 是由他的工厂子类去实现
            // 但是这个创建的方法在本类 他是一个抽象的方法
            //
            // 执行这个披萨的制作过程
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();

        } while (true);

    }

    // 写一个方法,可以获取客户希望订购的披萨种类
    private String getType() {
        BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("input pizza type:");
        String str = null;
        try {
            str = strin.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return str;
    }
}
