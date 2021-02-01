package com.atguigu.principle;

/**
 * ClassName: SingleResponsiblity3 <br/>
 * Description: SingleResponsiblity3 <br/>
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
public class SingleResponsiblity3 {
    public static void main(String[] args) {
        // todo
        Vehicle2 v2 = new Vehicle2();
        v2.run("汽车");
        v2.runWater("轮船");
        v2.runAir("飞机");

    }
}



/*
* 方式3的分析
* 1. 这种修改方法,没有对原来的类做出大的修改,只是增加方法
* 2. 在一定程度上,虽然没有在类级别上遵守单一职责原则,但是在方法级别上,仍然是遵守单一职责原则
*
* */
class Vehicle2{

    public void run(String vehicle) {
        System.out.println(vehicle+"ve在路上运行........");
    }
    public void runAir(String vehicle) {
        System.out.println(vehicle+"ve在天空运行........");
    }public void runWater(String vehicle) {
        System.out.println(vehicle+"ve在水中运行........");
    }
}
