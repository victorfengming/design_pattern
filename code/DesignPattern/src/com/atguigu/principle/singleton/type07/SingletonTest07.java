package com.atguigu.principle.singleton.type07;

/**
 * @author victor
 * @site https://victorfengming.github.io/
 * @company XDL
 * @project java_mode
 * @package com.atguigu.principle.singleton.type07
 * @created 2021-02-02 20:37
 * @function ""
 */
public class SingletonTest07 {

    public static void main(String[] args) {
        System.out.println("使用静态内部类完成单例设计模式!");
        Singleton ins = Singleton.getInstance();
        Singleton ins2 = Singleton.getInstance();
        System.out.println(ins);
        System.out.println(ins.hashCode());
        System.out.println(ins2);
        System.out.println(ins2.hashCode());
        System.out.println(ins == ins2);
        Singleton ins4 = Singleton.getInstance();
        System.out.println(ins4);
        /*
        * 使用静态内部类完成单例设计模式!
        com.atguigu.principle.singleton.type07.Singleton@1540e19d
        356573597
        com.atguigu.principle.singleton.type07.Singleton@1540e19d
        356573597
        true
        com.atguigu.principle.singleton.type07.Singleton@1540e19d
        * */
    }
}


// 静态内部类完成,推荐使用
class Singleton {
    private static volatile Singleton instance;

    // 构造器私有化
    private Singleton() {
    }

    // 写一个静态累不累,该类中有一个静态的属性,这个静态属性他有一个类型就是,Singleton
    private static class SingletonInstance {
        // 通过jvm底层装载机制保证了,这个是线程安全的
        private static final Singleton INSTANCE = new Singleton();
    }

    // 提供一个静态公有方法,直接返回SingletonInstance.INSTANCE
    public static Singleton getInstance() {
        return SingletonInstance.INSTANCE;
    }
}