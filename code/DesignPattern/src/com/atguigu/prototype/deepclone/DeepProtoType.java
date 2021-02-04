package com.atguigu.prototype.deepclone;

import java.io.Serializable;


public class DeepProtoType implements Serializable,Cloneable {
    public String name; // String 属性
    public DeepCloneableTarget deepCloneableTarget; // 引用类型属性

    public DeepProtoType() {
        super();
    }

    // 深拷贝 -- 方式1 使用clone方法
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object deep = null;
        // 这里完成对基本数据类型(属性) 和String 的克隆
        deep = super.clone();
        // 对引用类型的属性,进行单独处理
        // 先创建,转换子类类型
        DeepProtoType deepProtoType = (DeepProtoType) deep;
        deepProtoType.deepCloneableTarget = (DeepCloneableTarget) deepCloneableTarget.clone();

        return deepProtoType;
    }
    /*
    * 问题: 这样不会递归拷贝么?
    * */
}
