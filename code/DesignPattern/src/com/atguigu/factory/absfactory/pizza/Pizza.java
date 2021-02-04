package com.atguigu.factory.absfactory.pizza;

/**
 * ClassName: Pizza <br/>
 * Description: Pizza <br/>
 * Date: 2021-02-03 15:14 <br/>
 * <br/>
 *
 * @author victor
 * @version 产品版本信息 2021年02月03日15:14分 victor(victorfm@163.com) 新建<br/>
 * <p>
 * 修改记录
 * @email victorfm@163.com
 * @project java_mode
 * @package com.atguigu.factory.factorymethod.pizzastore
 */
public abstract class Pizza {

    protected String name;  // 披萨名字

    // 准备原材料,不同的pizza是不一样的
    // ,因此我们做成一个抽象方法
    public abstract void prepare();


    // 烘烤
    public void bake() {
        System.out.println(name+"baking;");
    }

    // 切片
    public void cut() {
        System.out.println(name+"cutting;");
    }

    //打包
    public void box() {
        System.out.println(name+"boxting;");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
