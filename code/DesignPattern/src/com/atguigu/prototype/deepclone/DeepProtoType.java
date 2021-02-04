package com.atguigu.prototype.deepclone;

import java.io.*;


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


    // 深拷贝 -- 方式2 通过对象的序列化实现(推荐)
    public Object deepClone(){

        // 创建流对象
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;

        try {
            // 序列化
            bos = new ByteArrayOutputStream();
            // 吧这个字节数组输出流换成了对象输出流
            oos = new ObjectOutputStream(bos);
            // 把当前这个对象以对象流的方式输出
            oos.writeObject(this);

            // 反序列化
            bis = new ByteArrayInputStream(bos.toByteArray());
            // 读进来就相当于把我们这个对象进行了克隆
            ois = new ObjectInputStream(bis);
            // ois就读到了原来序列化出去的这个对象
            DeepProtoType copyObj = (DeepProtoType)ois.readObject();
            // 我用序列化这个特点,把你关联的引用的输出出去,读回来后就相当云拷贝了
            return copyObj;
            // 我们这波操作就是充分利用我们的序列化和饭序列化,
            // 把当前对象以对象流的方式输出和读回来,就不用一个一个来搞了
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            // 关闭已经打开的流
            try {
                bos.close();
                oos.close();
                bis.close();
                ois.close();
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println(e.getMessage());
            }
        }

        return null;
    }
}
