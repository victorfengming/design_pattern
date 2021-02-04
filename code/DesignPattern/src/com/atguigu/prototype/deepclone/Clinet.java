package com.atguigu.prototype.deepclone;


public class Clinet {
    public static void main(String[] args) throws CloneNotSupportedException {
        DeepProtoType p = new DeepProtoType();
        p.name = "松江";
        p.deepCloneableTarget = new DeepCloneableTarget("大牛", "小牛");

        // 方式2 完成深拷贝
        DeepProtoType p2 = (DeepProtoType) p.deepClone();

        System.out.println(p);
        System.out.println(p.name);
        System.out.println(p.deepCloneableTarget);
        System.out.println(p2);
        System.out.println(p2.name);
        System.out.println(p2.deepCloneableTarget);
        /*
        com.atguigu.prototype.deepclone.DeepProtoType@330bedb4
        松江
        com.atguigu.prototype.deepclone.DeepCloneableTarget@2503dbd3
        com.atguigu.prototype.deepclone.DeepProtoType@4f3f5b24
        松江
        com.atguigu.prototype.deepclone.DeepCloneableTarget@15aeb7ab

        Process finished with exit code 0
        * */

    }
}
