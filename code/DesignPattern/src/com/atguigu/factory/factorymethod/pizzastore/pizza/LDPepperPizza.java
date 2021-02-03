package com.atguigu.factory.factorymethod.pizzastore.pizza;

/**
 * ClassName: LDPepperPizza <br/>
 * Description: LDPepperPizza <br/>
 * Date: 2021-02-03 15:18 <br/>
 * <br/>
 *
 * @author yufengming
 * @version 产品版本信息 2021年02月03日15:18分 yufengming(yufengming@travelsky.com) 新建<br/>
 * <p>
 * 修改记录
 * @email yufengming@travelsky.com
 * @project java_mode
 * @package com.atguigu.factory.factorymethod.pizzastore.pizza
 */
public class LDPepperPizza extends Pizza{
    @Override
    public void prepare() {
        setName("给伦敦的胡椒披萨");
        System.out.println("给伦敦的胡椒披萨准备原材料!");
    }
}