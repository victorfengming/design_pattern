package com.atguigu.factory.simplefactory.pizzastore.order;

import com.atguigu.factory.simplefactory.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * ClassName: OrderPizza <br/>
 * Description: OrderPizza <br/>
 * Date: 2021-02-03 10:14 <br/>
 * <br/>
 *
 * @author victor
 * @version 产品版本信息 2021年02月03日10:14分 victor(victorfm@163.com) 新建<br/>
 * <p>
 * 修改记录
 * @email victorfm@163.com
 * @project java_mode
 * @package com.atguigu.factory.simplefactory.pizzastore
 */
public class OrderPizza {

    // 定义一个简单工厂对象
    SimpleFactory simpleFactory;
    Pizza pizza = null;

    // 构造器
    public OrderPizza(SimpleFactory simpleFactory) {
        setFactory(simpleFactory);
    }

    public void setFactory(SimpleFactory simpleFactory) {
        String orderType = ""; //用户输入的

        this.simpleFactory = simpleFactory;// 设置简单工厂对象
        //
        do {
            orderType = getType();
            //
            pizza = this.simpleFactory.createPizza(orderType);
            // 输出pizza
            if (pizza != null) {
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            } else {
                System.out.println("么有这个披萨,订购失败");
                break;
            }
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
