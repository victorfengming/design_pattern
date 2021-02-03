package com.atguigu.factory.simplefactory.pizzastore.order;

import com.atguigu.factory.simplefactory.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * ClassName: OrderPizza2 <br/>
 * Description: OrderPizza2 <br/>
 * Date: 2021-02-03 14:36 <br/>
 * <br/>
 *
 * @author yufengming
 * @version 产品版本信息 2021年02月03日14:36分 yufengming(yufengming@travelsky.com) 新建<br/>
 * <p>
 * 修改记录
 * @email yufengming@travelsky.com
 * @project java_mode
 * @package com.atguigu.factory.simplefactory.pizzastore.order
 */
public class OrderPizza2 {

    Pizza pizza = null;
    String orderType = "";

    // 构造器
    public OrderPizza2() {

         do {
            orderType = getType();
            //
            pizza = SimpleFactory.createPizza2(orderType);
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
