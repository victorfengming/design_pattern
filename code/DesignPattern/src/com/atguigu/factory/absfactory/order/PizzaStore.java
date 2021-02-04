package com.atguigu.factory.absfactory.order;

/**
 * ClassName: PizzaStore <br/>
 * Description: PizzaStore <br/>
 * Date: 2021-02-04 9:45 <br/>
 * <br/>
 *
 * @author yufengming
 * @version 产品版本信息 2021年02月04日9:45分 yufengming(yufengming@travelsky.com) 新建<br/>
 * <p>
 * 修改记录
 * @email yufengming@travelsky.com
 * @project java_mode
 * @package com.atguigu.factory.absfactory.order
 */
public class PizzaStore {
    public static void main(String[] args) {
        System.out.println();
        new OrderPizza(new BJFactory());
        // 运行
        /*
        input pizza type:
        cheese
        使用到的是抽象农场模式i
        给北京的奶酪披萨准备原材料!
        北京的奶酪披萨baking;
        北京的奶酪披萨cutting;
        北京的奶酪披萨boxting;
        * */
    }
}
