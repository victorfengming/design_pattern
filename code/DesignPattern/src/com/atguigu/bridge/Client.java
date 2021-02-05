package com.atguigu.bridge;


public class Client {
    public static void main(String[] args) {
        // 获取折叠式手机(样式 + 品牌
        Phone phone1 = new FoldedPhone(new XiaoMi());
        phone1.open();
        phone1.call();
        phone1.close();

        System.out.println("-----------");
        Phone phone2 = new UpRightPhone(new Vivo());
        phone2.open();
        phone2.call();
        phone2.close();
        /*
        小米手机开机
        打开折叠样式手机
        小米手机打电话!
        折叠样式手机打电话
        xiaomi shoyji关机
        关闭折叠样式手机
        -----------
        vivo手机开机
        打开直板样式手机
        vivo手机打电话!
        直板样式手机打电话
        vivo shoyji关机
        关闭直板样式手机

        Process finished with exit code 0
        * */
    }
}
