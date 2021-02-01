package com.atguigu.principle.Inversion;

/**
 * ClassName: DependecyInversion <br/>
 * Description: DependecyInversion <br/>
 * Date: 2021-02-01 16:14 <br/>
 * <br/>
 *
 * @author yufengming
 * @version 产品版本信息 2021年02月01日16:14分 yufengming(yufengming@travelsky.com) 新建<br/>
 * <p>
 * 修改记录
 * @email yufengming@travelsky.com
 * @project java_mode
 * @package com.atguigu.principle.Inversion
 */
public class DependecyInversion {

    public static void main(String[] args) {
        // 客户端无需改变
        Person p = new Person();
        p.receive(new Email());

    }

}

// 定义接口
interface IReceiver{
    public String getInfo();
}
class Email implements IReceiver{
    public String getInfo() {
        return " 电子邮件信息:hellworld";
    }

}


/*
完成 Person 接收消息功能
* 方式2

* */
class Person{
    public void receive(IReceiver iReceiver) {
        System.out.println(iReceiver.getInfo());
    }
}