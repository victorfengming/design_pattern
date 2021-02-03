package com.atguigu.principle.singleton.type04;

/**
 * @author victor
 * @site https://victorfengming.github.io/
 * @company XDL
 * @project java_mode
 * @package com.atguigu.principle.singleton.type04
 * @created 2021-02-02 19:29
 * @function ""
 */
public class Singleton04 {

public static void main(String[] args) {
        Singleton ins = Singleton.getInstance();
        Singleton ins2 = Singleton.getInstance();
        System.out.println(ins);
        System.out.println(ins.hashCode());
        System.out.println(ins2);
        System.out.println(ins2.hashCode());
        System.out.println(ins == ins2);
    }

}

// 懒汉式 (线程安全_ 同步放法_)
class Singleton{
    private static Singleton instance;

    private Singleton() {

    }

    // 提供一个静态的公有方法 加入了同步处理的代码
    // 解决线程安全问题
    // 即懒汉式
    // 我们在这里加一个关键字 synchronized
    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
