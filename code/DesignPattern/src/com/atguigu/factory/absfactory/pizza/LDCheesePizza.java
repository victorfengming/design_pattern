package com.atguigu.factory.absfactory.pizza;

/**
 * ClassName: LDCheesePizza <br/>
 * Description: LDCheesePizza <br/>
 * Date: 2021-02-03 15:19 <br/>
 * <br/>
 *
 * @author victor
 * @version 产品版本信息 2021年02月03日15:19分 victor(victorfm@163.com) 新建<br/>
 * <p>
 * 修改记录
 * @email victorfm@163.com
 * @project java_mode
 * @package com.atguigu.factory.factorymethod.pizzastore.pizza
 */
public class LDCheesePizza extends Pizza {
    @Override
    public void prepare() {
        setName("伦敦奶酪披萨!");
        System.out.println("给伦敦奶酪披萨准备原材料");
    }
}
