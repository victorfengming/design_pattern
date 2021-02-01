package com.atguigu.principle.singleResponsibility;

/**
 * ClassName: SingleResponsiblity1 <br/>
 * Description: SingleResponsiblity1 <br/>
 * Date: 2021-02-01 14:48 <br/>
 * <br/>
 *
 * @author yufengming
 * @version 产品版本信息 2021年02月01日14:48分 yufengming(yufengming@travelsky.com) 新建<br/>
 * <p>
 * 修改记录
 * @email yufengming@travelsky.com
 * @project java_mode
 * @package com.atguigu.principle
 */
public class SingleResponsiblity1 {
    public static void main(String[] args) {
        // todo
        Vehicle vehicle = new Vehicle();
        vehicle.run("摩托车");
        vehicle.run("汽车");
        vehicle.run("飞机");
    }
}


// 交通工具类
// 方式1
// 1. 在方式1 的run方法中,违反了单一职责原则
//解决方法,就是分成2个类
class Vehicle{

    public void run(String vehicle) {
        System.out.println(vehicle+"ve在公路上运行........");
    }
}
