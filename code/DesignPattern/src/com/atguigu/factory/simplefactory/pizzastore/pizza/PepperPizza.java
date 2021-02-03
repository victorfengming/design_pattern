package com.atguigu.factory.simplefactory.pizzastore.pizza;

/**
 * ClassName: PepperPizza <br/>
 * Description: PepperPizza <br/>
 * Date: 2021-02-03 10:53 <br/>
 * <br/>
 *
 * @author yufengming
 * @version 产品版本信息 2021年02月03日10:53分 yufengming(yufengming@travelsky.com) 新建<br/>
 * <p>
 * 修改记录
 * @email yufengming@travelsky.com
 * @project java_mode
 * @package com.atguigu.factory.simplefactory.pizzastore.pizza
 */
public class PepperPizza extends Pizza{

    @Override
    public void prepare() {
        System.out.println("给胡椒披萨准备原材料!");
    }
}
