package com.atguigu.visitor;


/**
 * @author victor
 * @site https://victorfengming.github.io/
 * @project design_pattern
 * @package com.atguigu.visitor
 * @created 2021-02-08 18:52
 * @function ""
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("-----给成功------");
        // 创建ObjectStructure
        ObjectStructure objectStructure = new ObjectStructure();
        // 1男1女
        objectStructure.attach(new Man());
        objectStructure.attach(new Woman());

        // 成功
        Success success = new Success();
        objectStructure.display(success);
        System.out.println("####给失败####>");
        Fail fail = new Fail();
        objectStructure.display(fail);
        System.out.println(">>>>>给待定>>>>>");
        Wait wait = new Wait();
        objectStructure.display(wait);
        /**
         * -----给成功------
         * 男的给的评价是该歌手 很成功 !
         * 女人给他评价很成功!
         * ####给失败####>
         * 男人给的评价是失败
         * 女的给他的评价也是失败的
         * >>>>>给待定>>>>>
         * 男人给的评价是待定about这个歌手
         * 女人给的歌手评价是待定
         *
         * Process finished with exit code 0
         */

    }
}
