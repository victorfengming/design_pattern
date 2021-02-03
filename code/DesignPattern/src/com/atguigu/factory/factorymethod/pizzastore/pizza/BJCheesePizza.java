package com.atguigu.factory.factorymethod.pizzastore.pizza;

/**
 * ClassName: BJCheesePizza <br/>
 * Description: BJCheesePizza <br/>
 * Date: 2021-02-03 15:15 <br/>
 * <br/>
 *
 * @author yufengming
 * @version 产品版本信息 2021年02月03日15:15分 yufengming(yufengming@travelsky.com) 新建<br/>
 * <p>
 * 修改记录
 * @email yufengming@travelsky.com
 * @project java_mode
 * @package com.atguigu.factory.factorymethod.pizzastore.pizza
 */
public class BJCheesePizza extends Pizza{

    @Override
    public void prepare() {
        setName("北京的奶酪披萨");
        System.out.println("给北京的奶酪披萨准备原材料!");
    }
}
