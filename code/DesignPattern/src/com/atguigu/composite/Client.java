package com.atguigu.composite;


public class Client {
    public static void main(String[] args) {
        // 从大到小创建对象
        OrganizationComponent uni = new University("清华大学", "中国顶级的大学");
        // 创建学院
        OrganizationComponent computerCollege = new College("计算机学院", "计算机IT技术NB");
        OrganizationComponent infoEngineerCollege = new College("信息学院", "信息与信号技术");
        computerCollege.add(new Department("软件工程", "软件工程NB"));
        computerCollege.add(new Department("计算机科学与技术", "老牌专业"));
        computerCollege.add(new Department("网络工程", "网络工程NB"));

        infoEngineerCollege.add(new Department("信息工程", "信公秤不好学"));
        infoEngineerCollege.add(new Department("通讯工程", "通公平不好学"));
        // 将学院加入到学院中
        uni.add(computerCollege);
        uni.add(infoEngineerCollege);

        uni.print();
        // 这里你用谁打印,就输出谁的下面的信息
        // 就灵活,比如你现在再有,一个级别,你可以把他聚合进来,嗯

        /*
        ------清华大学-----
        ------计算机学院-----
        软件工程
        计算机科学与技术
        网络工程
        ------信息学院-----
        信息工程
        通讯工程

        Process finished with exit code 0
        * */
    }
}
