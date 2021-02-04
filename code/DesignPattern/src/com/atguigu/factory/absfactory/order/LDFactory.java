package com.atguigu.factory.absfactory.order;

import com.atguigu.factory.absfactory.pizza.LDCheesePizza;
import com.atguigu.factory.absfactory.pizza.LDPepperPizza;
import com.atguigu.factory.absfactory.pizza.Pizza;

/**
 * ClassName: LDFactory <br/>
 * Description: LDFactory <br/>
 * Date: 2021-02-04 9:36 <br/>
 * <br/>
 *
 * @author victor
 * @version 产品版本信息 2021年02月04日9:36分 victor(victorfm@163.com) 新建<br/>
 * <p>
 * 修改记录
 * @email victorfm@163.com
 * @project java_mode
 * @package com.atguigu.factory.absfactory.order
 */
public class LDFactory implements AbsFactory{
    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if (orderType.equals("cheese")) {
            pizza = new LDCheesePizza();
        } else if (orderType.equals("pepper")) {
            pizza = new LDPepperPizza();
        } else {

        }
        return pizza;
    }
}
