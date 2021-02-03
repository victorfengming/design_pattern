package com.atguigu.principle.singleResponsibility;

/**
 * ClassName: SingleResponsiblity2 <br/>
 * Description: SingleResponsiblity2 <br/>
 * Date: 2021-02-01 14:48 <br/>
 * <br/>
 *
 * @author victor
 * @version 产品版本信息 2021年02月01日14:48分 victor(victorfm@163.com) 新建<br/>
 * <p>
 * 修改记录
 * @email victorfm@163.com
 * @project java_mode
 * @package com.atguigu.principle
 */
public class SingleResponsiblity2 {
    public static void main(String[] args) {
        // todo
        RoadVehicle rv = new RoadVehicle();
        rv.run("摩托车");
        rv.run("汽车");

        AirVehicle av = new AirVehicle();

        av.run("飞机");
    }
}


// 交通工具类
// 方式2
// 1. 这样他就遵守了单一职责原则
// 2. 但是这样做花销很大,改动很大,即将类分解,修改客户端
// 3. 改进: 直接修改Vehicle类,改动很小
class RoadVehicle{

    public void run(String vehicle) {
        System.out.println(vehicle+"ve在公路上运行........");
    }
}


class AirVehicle{

    public void run(String vehicle) {
        System.out.println(vehicle+"ve在天上上运行........");
    }
}

class WaterVehicle{

    public void run(String vehicle) {
        System.out.println(vehicle+"ve在水上运行........");
    }
}
