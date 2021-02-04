package com.atguigu.prototype.deepclone;


public class Clinet {
    public static void main(String[] args) throws CloneNotSupportedException {
        DeepProtoType p = new DeepProtoType();
        p.name = "松江";
        p.deepCloneableTarget = new DeepCloneableTarget("大牛", "小牛");

        //方式1 完成深拷贝
        DeepProtoType p2 = (DeepProtoType) p.clone();

        System.out.println(p);
        System.out.println(p.name);
        System.out.println(p.deepCloneableTarget);
        System.out.println(p2);
        System.out.println(p2.name);
        System.out.println(p2.deepCloneableTarget);
        /*
        com.atguigu.prototype.deepclone.DeepProtoType@1540e19d
        松江
        com.atguigu.prototype.deepclone.DeepCloneableTarget@677327b6
        com.atguigu.prototype.deepclone.DeepProtoType@14ae5a5
        松江
        com.atguigu.prototype.deepclone.DeepCloneableTarget@7f31245a

        Process finished with exit code 0

        * */
        /*
        * todo 这种方式 就是可以 实现深拷贝
        * 说白了就是,在里面 提取出来属性对象, 单独进行拷贝
        * */
    }
}
