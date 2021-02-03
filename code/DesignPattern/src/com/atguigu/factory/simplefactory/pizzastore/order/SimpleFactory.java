package com.atguigu.factory.simplefactory.pizzastore.order;

import com.atguigu.factory.simplefactory.pizzastore.pizza.CheesePizza;
import com.atguigu.factory.simplefactory.pizzastore.pizza.GreekPizza;
import com.atguigu.factory.simplefactory.pizzastore.pizza.Pizza;

/**
 * ClassName: SimpleFactory <br/>
 * Description: SimpleFactory <br/>
 * Date: 2021-02-03 11:10 <br/>
 * <br/>
 *
 * @author victor
 * @version 产品版本信息 2021年02月03日11:10分 victor(victorfm@163.com) 新建<br/>
 * <p>
 * 修改记录
 * @email victorfm@163.com
 * @project java_mode
 * @package com.atguigu.factory.simplefactory.pizzastore.order
 */
public class SimpleFactory {

    // 根据orderType 返回一个对应的Pizza对象

    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        System.out.println("使用简单工厂模式");
        if (orderType.equals("greek")) {
            pizza = new GreekPizza();
            pizza.setName("希腊披萨!");
        } else if (orderType.equals("cheese")) {
            pizza = new CheesePizza();
            pizza.setName("奶酪披萨!");
        } else if (orderType.equals("pepper")) {
            pizza = new CheesePizza();
            pizza.setName("胡椒披萨!");
        }
        return pizza;
    }

    // 简单工厂模式 也叫 静态工厂模式

    public static Pizza createPizza2(String orderType) {
        Pizza pizza = null;
        System.out.println("使用简单工厂模式");
        if (orderType.equals("greek")) {
            pizza = new GreekPizza();
            pizza.setName("希腊披萨!");
        } else if (orderType.equals("cheese")) {
            pizza = new CheesePizza();
            pizza.setName("奶酪披萨!");
        } else if (orderType.equals("pepper")) {
            pizza = new CheesePizza();
            pizza.setName("胡椒披萨!");
        }
        return pizza;
    }
}
