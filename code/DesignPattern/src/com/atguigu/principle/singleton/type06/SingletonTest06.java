package com.atguigu.principle.singleton.type06;

/**
 * @author victor
 * @site https://victorfengming.github.io/
 * @company XDL
 * @project java_mode
 * @package com.atguigu.principle.singleton.type06
 * @created 2021-02-02 19:52
 * @function ""
 */
public class SingletonTest06 {
    public static void main(String[] args) {
        System.out.println("双重检查!");
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
        // com.atguigu.principle.singleton.type06.Singleton@1540e19d
        // 356573597
        // com.atguigu.principle.singleton.type06.Singleton@1540e19d
        // 356573597
        // true
        // com.atguigu.principle.singleton.type06.Singleton@1540e19d
    }
}


class Singleton{
    private static volatile Singleton instance;
    private Singleton(){}
    // 提供一个静态的公有方法,加入双重检查代码
    // ,解决线程安全问题,同时解决懒加载问题
    public static Singleton getInstance(){
        if (instance == null) {
            synchronized(Singleton.class){
                instance = new Singleton();
            }
            // 同步代码,效率是比较低的
            // 只是在判断外就走过了
        }
        return instance;
    }
}