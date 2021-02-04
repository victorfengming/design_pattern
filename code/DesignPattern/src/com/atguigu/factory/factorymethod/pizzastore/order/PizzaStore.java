package com.atguigu.factory.factorymethod.pizzastore.order;

/**
 * ClassName: PizzaStore <br/>
 * Description: PizzaStore <br/>
 * Date: 2021-02-03 16:51 <br/>
 * <br/>
 *
 * @author victor
 * @version 产品版本信息 2021年02月03日16:51分 victor(victorfm@163.com) 新建<br/>
 * <p>
 * 修改记录
 * @email victorfm@163.com
 * @project java_mode
 * @package com.atguigu.factory.factorymethod.pizzastore.order
 */
public class PizzaStore {
    public static void main(String[] args) {
        // 创建北京口味 各种 Pizza
        new BJOrderPizza();
        /*
        *
        * input pizza type:
        cheese
        给北京的奶酪披萨准备原材料!
        北京的奶酪披萨baking;
        北京的奶酪披萨cutting;
        北京的奶酪披萨boxting;
        *
        * input pizza type:
        pepper
        北京的胡椒披萨准备原材料!
        北京的胡椒披萨baking;
        北京的胡椒披萨cutting;
        北京的胡椒披萨boxting;
        * */

        // todo 还可以 加上 北京or 伦敦的供用户选择的嗯
        // 比如加上location
        // 创建伦敦口额为的各种披萨
//        new LDOrderPizza();

        // 这个代码就不写了

        // 你永远无法叫醒一个装睡的人
    }
}
