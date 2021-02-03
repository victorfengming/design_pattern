package com.atguigu.factory.simplefactory.pizzastore.order;

import com.atguigu.factory.simplefactory.pizzastore.pizza.Pizza;

/**
 * ClassName: PizzaStore <br/>
 * Description: PizzaStore <br/>
 * Date: 2021-02-03 10:26 <br/>
 * <br/>
 *
 * @author victor
 * @version 产品版本信息 2021年02月03日10:26分 victor(victorfm@163.com) 新建<br/>
 * <p>
 * 修改记录
 * @email victorfm@163.com
 * @project java_mode
 * @package com.atguigu.factory.simplefactory.pizzastore.order
 */
public class PizzaStore {
    public static void main(String[] args) {
        System.out.println();
        // 使用简单工厂模式
//        new OrderPizza(new SimpleFactory());
//        System.out.println("退出程序");
        new OrderPizza2();
    }
}
