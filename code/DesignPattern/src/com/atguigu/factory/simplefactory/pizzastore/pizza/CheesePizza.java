package com.atguigu.factory.simplefactory.pizzastore.pizza;

/**
 * ClassName: CheesePizza <br/>
 * Description: CheesePizza <br/>
 * Date: 2021-02-03 10:12 <br/>
 * <br/>
 *
 * @author yufengming
 * @version 产品版本信息 2021年02月03日10:12分 yufengming(yufengming@travelsky.com) 新建<br/>
 * <p>
 * 修改记录
 * @email yufengming@travelsky.com
 * @project java_mode
 * @package com.atguigu.factory.simplefactory.pizzastore
 */

// 奶酪披萨
public class CheesePizza extends Pizza {

    @Override
    public void prepare() {
        System.out.println("给奶酪披萨准备原材料!");
    }
}
