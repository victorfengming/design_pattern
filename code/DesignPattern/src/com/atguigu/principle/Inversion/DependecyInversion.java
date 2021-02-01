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
        Person p = new Person();
        p.receive(new Email());

    }

}


class Email{
    public String getInfo() {
        return " 电子邮件信息:hellworld";
    }

}
/*
完成 Person 接收消息功能
* 方式1 : 分析
1. 简单呐, 比较容易能够想到
2. 如果,我们获取的对象是 微信 ,短信 等等,则 要新增类
3. 解决思路: 引入一个抽象的接口IReceiver, 表示接收者, 这样Person

类与接口 IReceiver 发生依赖

因为Email,WeiXin 等等 属于接收范围 ,他们各自实现IReceiver 接口就 OK,

* */
class Person{
    public void receive(Email email) {
        System.out.println(email.getInfo());
    }
}