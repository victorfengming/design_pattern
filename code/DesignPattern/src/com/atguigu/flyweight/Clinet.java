package com.atguigu.flyweight;


public class Clinet {
    public static void main(String[] args) {
        System.out.println();
        // 创建一个工厂类
        WebSiteFactory factory = new WebSiteFactory();
        // 现在客户要一个以新闻形式发布的网站
        WebSite webSite1 = factory.getWebSiteCategory("新闻");
        webSite1.use();
        // 现在客户要一个以博客形式发布的网站
        WebSite webSite2 = factory.getWebSiteCategory("博客");
        webSite2.use();
        // 现在客户又要一个以博客形式发布的网站
        WebSite webSite3 = factory.getWebSiteCategory("博客");
        webSite3.use();
        /*
        网站的发布形式为: 新闻输出
        网站的发布形式为: 博客输出
        网站的发布形式为: 博客输出

        Process finished with exit code 0
        * */
    }
}
