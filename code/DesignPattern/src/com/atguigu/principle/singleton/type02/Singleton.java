package com.atguigu.principle.singleton.type02;

/**
 * @author victor
 * @site https://victorfengming.github.io/
 * @company XDL
 * @project java_mode
 * @package com.atguigu.principle.singleton.type02
 * @created 2021-02-02 18:55
 * @function ""
 */

//
public class Singleton {

    // 1. 构造器私有化,外部不可以new
    private Singleton() {
    }

    // 2. 本类内部创建对象实例

    private static Singleton instance;

    static {
        // 在静态代码块儿中,创建单例对象
        instance = new Singleton();
    }

    // 3. 提供一个工友的静态方法,返回实例对象
    public static Singleton getInstance() {
        return instance;
    }
}
