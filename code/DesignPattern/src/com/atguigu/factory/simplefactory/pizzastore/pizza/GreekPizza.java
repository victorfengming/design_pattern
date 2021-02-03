package com.atguigu.factory.simplefactory.pizzastore.pizza;

/**
 * ClassName: GreekPizza <br/>
 * Description: GreekPizza <br/>
 * Date: 2021-02-03 10:13 <br/>
 * <br/>
 *
 * @author yufengming
 * @version 产品版本信息 2021年02月03日10:13分 yufengming(yufengming@travelsky.com) 新建<br/>
 * <p>
 * 修改记录
 * @email yufengming@travelsky.com
 * @project java_mode
 * @package com.atguigu.factory.simplefactory.pizzastore
 */

// 希腊披萨
public class GreekPizza extends Pizza {

    @Override
    public void prepare() {
        System.out.println("给希腊披萨准备原材料");
    }
}
