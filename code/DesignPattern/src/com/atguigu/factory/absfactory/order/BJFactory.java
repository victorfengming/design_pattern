package com.atguigu.factory.absfactory.order;

import com.atguigu.factory.absfactory.pizza.BJCheesePizza;
import com.atguigu.factory.absfactory.pizza.BJPepperPizza;
import com.atguigu.factory.absfactory.pizza.Pizza;

/**
 * ClassName: BJFactory <br/>
 * Description: BJFactory <br/>
 * Date: 2021-02-04 9:34 <br/>
 * <br/>
 *
 * @author yufengming
 * @version 产品版本信息 2021年02月04日9:34分 yufengming(yufengming@travelsky.com) 新建<br/>
 * <p>
 * 修改记录
 * @email yufengming@travelsky.com
 * @project java_mode
 * @package com.atguigu.factory.absfactory.order
 */


// 这是一个工厂子类
public class BJFactory implements AbsFactory{
    @Override
    public Pizza createPizza(String orderType) {
        System.out.println("使用到的是抽象农场模式i");
        Pizza pizza = null;
        if (orderType.equals("cheese")) {
            pizza = new BJCheesePizza();
        } else if (orderType.equals("pepper")) {
            pizza = new BJPepperPizza();
        } else {

        }
        return pizza;
    }
}
