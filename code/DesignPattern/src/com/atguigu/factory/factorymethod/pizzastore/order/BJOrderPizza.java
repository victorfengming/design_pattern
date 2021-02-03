package com.atguigu.factory.factorymethod.pizzastore.order;

import com.atguigu.factory.factorymethod.pizzastore.pizza.BJCheesePizza;
import com.atguigu.factory.factorymethod.pizzastore.pizza.BJPepperPizza;
import com.atguigu.factory.factorymethod.pizzastore.pizza.Pizza;

/**
 * ClassName: BJOrderPizza <br/>
 * Description: BJOrderPizza <br/>
 * Date: 2021-02-03 16:46 <br/>
 * <br/>
 *
 * @author victor
 * @version 产品版本信息 2021年02月03日16:46分 victor(victorfm@163.com) 新建<br/>
 * <p>
 * 修改记录
 * @email victorfm@163.com
 * @project java_mode
 * @package com.atguigu.factory.factorymethod.pizzastore.order
 */
public class BJOrderPizza extends OrderPizza {

    @Override
    Pizza createPizza(String orderType) {

        Pizza pizza = null;
        if (orderType.equals("cheese")) {
            pizza = new BJCheesePizza();
        } else if (orderType.equals("pepper")) {
            pizza = new BJPepperPizza();
        }
        return pizza;
    }
}
