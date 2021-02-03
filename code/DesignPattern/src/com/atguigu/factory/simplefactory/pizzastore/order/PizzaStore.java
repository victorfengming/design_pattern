package com.atguigu.factory.simplefactory.pizzastore.order;

import com.atguigu.factory.simplefactory.pizzastore.pizza.Pizza;

/**
 * ClassName: PizzaStore <br/>
 * Description: PizzaStore <br/>
 * Date: 2021-02-03 10:26 <br/>
 * <br/>
 *
 * @author yufengming
 * @version 产品版本信息 2021年02月03日10:26分 yufengming(yufengming@travelsky.com) 新建<br/>
 * <p>
 * 修改记录
 * @email yufengming@travelsky.com
 * @project java_mode
 * @package com.atguigu.factory.simplefactory.pizzastore.order
 */
public class PizzaStore {
    public static void main(String[] args) {
        System.out.println();
        new OrderPizza(new SimpleFactory());
        /*
        input pizza type:
        cheese
        使用简单工厂模式
        给奶酪披萨准备原材料!
        奶酪披萨!baking;
        奶酪披萨!cutting;
        奶酪披萨!boxting;
        * */
    }
}
