package com.atguigu.jdk;


import java.io.DataInputStream;
import java.io.FileInputStream;

public class Decorator {
    public static void main(String[] args) throws Exception{
        // 说明
        // 1. InputStream 是抽象类,类似我们前面的Drink
        // 2. FileInputStream 是 InputStream 子类,类似我们前面的DeCaf, LongBlack
        // 3. FilterInputStream 是 InputStream 子类: 类似我们其那面的 Decorator 修饰者
        // 4. DataInputStream 是 FilterInputStream子类, 具体的修饰者,类似其那面的 Milk,Soy 等
        // 5. FilterInputStream 类 有 protected volatile InputStream in; 即含被装饰者
        // 6. 分析得出: 在jdk的IO体系中,就是使用装饰者模式
        DataInputStream dis = new DataInputStream(
            new FileInputStream("E:\\Projects\\IdeaProjects\\design_pattern\\out\\demo.txt")
        );
        System.out.println(dis.read());
        dis.close();

    }
}
