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
        // gu.principle.singleton.type06.SingletonTest06
        // Singleton@1540e19d
        // 356573597
        // Singleton@1540e19d
        // 356573597
        // true
        // Singleton@1540e19d
    }
}


// 静态内部类
class Singleton {
    private static volatile Singleton instance;

    // 构造器私有化
    private Singleton() {
    }

    // 写一个静态累不累,该类中有一个静态的属性,这个静态属性他有一个类型就是,Singleton
    private static class SingletonInstance {
        private static final Singleton INSTANCE = new Singleton();
    }

    // 提供一个静态公有方法
    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
            // 同步代码,效率是比较低的
            // 只是在判断外就走过了
        }
        return instance;
    }
}