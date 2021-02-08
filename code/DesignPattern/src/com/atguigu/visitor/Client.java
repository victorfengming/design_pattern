package com.atguigu.visitor;



public class Client {
    public static void main(String[] args) {
        System.out.println("-----------");
        // 创建ObjectStructure
        ObjectStructure objectStructure = new ObjectStructure();
        // 1男1女
        objectStructure.attach(new Man());
        objectStructure.attach(new Woman());

        // 成功
        Success success = new Success();
        objectStructure.display(success);
        System.out.println("--------->");
        Fail fail = new Fail();
        objectStructure.display(fail);
        /**
         * -----------
         * 男的给的评价是该歌手 很成功 !
         * 女人给他评价很成功!
         * --------->
         * 男人给的评价是失败
         * 女的给他的评价也是失败的
         *
         * Process finished with exit code 0
         */

    }
}
