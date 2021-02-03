package com.atguigu.factory.factorymethod.pizzastore.order;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * ClassName: OrderPizza <br/>
 * Description: OrderPizza <br/>
 * Date: 2021-02-03 15:21 <br/>
 * <br/>
 *
 * @author yufengming
 * @version 产品版本信息 2021年02月03日15:21分 yufengming(yufengming@travelsky.com) 新建<br/>
 * <p>
 * 修改记录
 * @email yufengming@travelsky.com
 * @project java_mode
 * @package com.atguigu.factory.factorymethod.pizzastore.order
 */
public class OrderPizza {

    // 写一个方法,可以获取客户希望订购的披萨种类
    private String getType() {
        BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("input pizza type:");
        String str = null;
        try {
            str = strin.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return str;
    }
}
