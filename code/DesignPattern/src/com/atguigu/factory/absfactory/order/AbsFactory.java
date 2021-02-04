package com.atguigu.factory.absfactory.order;

import com.atguigu.factory.absfactory.pizza.Pizza;

/**
 * ClassName: AbsFactory <br/>
 * Description: AbsFactory <br/>
 * Date: 2021-02-04 9:32 <br/>
 * <br/>
 *
 * @author yufengming
 * @version 产品版本信息 2021年02月04日9:32分 yufengming(yufengming@travelsky.com) 新建<br/>
 * <p>
 * 修改记录
 * @email yufengming@travelsky.com
 * @project java_mode
 * @package com.atguigu.factory.absfactory.order
 */


// 一个抽象工厂模式的抽象层(接口)
public interface AbsFactory {
    // 让下面的工厂子类来具体实现
    public Pizza createPizza(String orderType);
}
