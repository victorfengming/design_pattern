package com.atguigu.factory.absfactory.pizza;

/**
 * ClassName: BJPepperPizza <br/>
 * Description: BJPepperPizza <br/>
 * Date: 2021-02-03 15:16 <br/>
 * <br/>
 *
 * @author victor
 * @version 产品版本信息 2021年02月03日15:16分 victor(victorfm@163.com) 新建<br/>
 * <p>
 * 修改记录
 * @email victorfm@163.com
 * @project java_mode
 * @package com.atguigu.factory.factorymethod.pizzastore.pizza
 */
public class BJPepperPizza extends Pizza {

    @Override
    public void prepare() {
        setName("北京的胡椒披萨");
        System.out.println("北京的胡椒披萨准备原材料!");
    }
}
